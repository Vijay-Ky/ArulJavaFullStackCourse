package in.vijaysprogramming.springcore.mainpackage.Sport;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
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

    //define our init method
    @PostConstruct
    public void doMyStartupStuff()
    {
        System.out.println("from doMyStartupStuff(): " + getClass().getSimpleName());
    }

    //define our destroy method
    @PreDestroy
    public void doMyCleanupStuff()
    {
        System.out.println("from doMyCleanupStuff(): " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout()
    {
        return "CricketPractice: Practice batting 30 minutes";
    }
}
