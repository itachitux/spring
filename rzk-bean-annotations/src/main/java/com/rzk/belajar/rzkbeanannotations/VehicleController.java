package com.rzk.belajar.rzkbeanannotations;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/vehicles")
public class VehicleController {

    @CrossOrigin
    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

}