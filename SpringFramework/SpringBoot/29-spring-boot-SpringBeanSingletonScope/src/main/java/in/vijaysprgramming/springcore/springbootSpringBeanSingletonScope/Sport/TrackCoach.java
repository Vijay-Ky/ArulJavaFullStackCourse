package in.vijaysprgramming.springcore.springbootSpringBeanSingletonScope.Sport;

import org.springframework.context.annotation.Lazy;
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
