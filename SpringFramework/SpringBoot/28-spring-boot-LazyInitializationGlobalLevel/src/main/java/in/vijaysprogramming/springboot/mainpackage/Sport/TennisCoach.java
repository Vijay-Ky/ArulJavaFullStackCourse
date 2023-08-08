package in.vijaysprogramming.springboot.mainpackage.Sport;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach
{
    public TennisCoach()
    {
        System.out.println("From constructor: " + getClass().getSimpleName());
    }
    public String getDailyWorkout()
    {
        return "TennisCoach: Practice tennis for 1 Hours";
    }
}
