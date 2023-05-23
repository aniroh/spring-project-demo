package com.example.myapp1.coach;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Run 15 laps and practice karaoke";
    }
}
