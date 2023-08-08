package in.vijaysprogramming.springboot.mainpackage.Sport;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach
{
    public CricketCoach()
    {
        System.out.println("From constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout()
    {
        return "CricketPractice: Practice batting 30 minutes";
    }
}
