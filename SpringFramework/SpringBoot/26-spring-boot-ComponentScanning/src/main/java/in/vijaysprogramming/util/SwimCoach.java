package in.vijaysprogramming.util;

import in.vijaysprogramming.springboot.springbootPrimaryVSQulifierAnnotation.Sport.Coach;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach
{
    public String getDailyWorkout()
    {
        return "SwimCoach: Swim for 100 meters";
    }
}

