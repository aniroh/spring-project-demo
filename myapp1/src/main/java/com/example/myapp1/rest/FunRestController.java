package com.example.myapp1.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // inject properties for ani.username and ani.profession from application.properties - custom properties
    @Value("${ani.surname}")
    private String aniSurname;

    @Value("${ani.profession}")
    private String aniProf;

    //new endpoint to display custom properties - custom properties
    @GetMapping("/aniinfo")
    public String AniInfo(){
        return "Anish "+ aniSurname+" works as a "+aniProf;
    }

    @GetMapping("/")
    public String SayHello(){
        return "Hello World";
    }



}
