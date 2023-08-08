package in.vijaysprogramming.springcore.mainpackage.Sport;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach
{
    public TrackCoach()
    {
        System.out.println("From constructor: " + getClass().getSimpleName());
    }
    public String getDailyWorkout()
    {
        return "TrackCoach: Practice Running for 30 Hours";
    }
}
