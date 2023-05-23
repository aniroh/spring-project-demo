package com.example.myapp1.rest;

import com.example.myapp1.coach.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //private field for the dependency
    private Coach bbCoach;
    private Coach ccCoach;
 //define constructor for dependency injection
    @Autowired
    public DemoController(@Qualifier("baseballCoach") Coach bbCoach, @Qualifier("cricketCoach") Coach ccCoach){
        this.bbCoach = bbCoach;
        this.ccCoach = ccCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return "baseball training: "+bbCoach.getDailyWorkout()+"<br> cricket training: "+ccCoach.getDailyWorkout();
    }
}
