package in.vijaysprogramming.springboot.springbootPrimaryVSQulifierAnnotation.Sport;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach
{
    public String getDailyWorkout()
    {
        return "TrackCoach: Practice Running for 30 Hours";
    }
}
