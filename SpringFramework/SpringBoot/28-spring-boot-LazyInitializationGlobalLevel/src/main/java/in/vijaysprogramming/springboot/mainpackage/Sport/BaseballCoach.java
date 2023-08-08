package in.vijaysprogramming.springboot.mainpackage.Sport;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach
{
    public BaseballCoach()
    {
        System.out.println("From constructor: " + getClass().getSimpleName());
    }
    public String getDailyWorkout()
    {
        return "BaseballCoach: Practice for 2 Hours";
    }
}
