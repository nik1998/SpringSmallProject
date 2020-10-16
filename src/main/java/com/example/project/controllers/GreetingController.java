package com.example.project.controllers;

import java.io.File;
import java.net.InetAddress;
import java.util.concurrent.atomic.AtomicLong;

import com.example.project.models.Greeting;
import com.example.project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.model.CityResponse;

@Controller
public class GreetingController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="Spring") String name, HttpServletRequest request) {
        try {
            String ip = request.getRemoteAddr();
            System.out.println(ip);
            ClassLoader classLoader = getClass().getClassLoader();
            File database = new File(classLoader.getResource("GeoLite2-City.mmdb").getFile());
            DatabaseReader dbReader = new DatabaseReader.Builder(database).build();

            InetAddress ipAddress = InetAddress.getByName(ip);
            CityResponse response = dbReader.city(ipAddress);

            String countryName = response.getCountry().getName();
            if(countryName.equalsIgnoreCase("RU")||countryName.equalsIgnoreCase("Russia"))
            {
                return "error";
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return "error";
    }

    @RequestMapping("/add")
    public String add() {
        userService.addMyUser();
        return "redirect:/"+userService.getCurrentUserId();
    }

}