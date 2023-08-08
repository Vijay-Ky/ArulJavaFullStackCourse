package in.vijaysprogramming.springboot.springbootPrimaryVSQulifierAnnotation.Sport;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach
{
    public String getDailyWorkout()
    {
        return "TennisCoach: Practice tennis for 1 Hours";
    }
}
