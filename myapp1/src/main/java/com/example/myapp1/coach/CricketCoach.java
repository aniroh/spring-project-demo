package com.example.myapp1.coach;

import org.springframework.stereotype.Component;

//component so the class will be detected during component scanning
@Component
public class CricketCoach implements Coach{
    //overriding the interface
    @Override
    public String getDailyWorkout(){
        return "Practice fast bowling for 15 minutes";
    }
}
