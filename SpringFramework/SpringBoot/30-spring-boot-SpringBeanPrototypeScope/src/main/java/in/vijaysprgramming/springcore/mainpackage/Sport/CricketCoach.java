package in.vijaysprgramming.springcore.mainpackage.Sport;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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
