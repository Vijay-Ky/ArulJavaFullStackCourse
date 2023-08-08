package in.vijaysprgramming.springcore.mainpackage.Sport;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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
