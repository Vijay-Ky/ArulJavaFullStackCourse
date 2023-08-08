package in.vijaysprogramming.springboot.springbootPrimaryVSQulifierAnnotation.Sport;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach
{
    public String getDailyWorkout()
    {
        return "BaseballCoach: Practice for 2 Hours";
    }
}
