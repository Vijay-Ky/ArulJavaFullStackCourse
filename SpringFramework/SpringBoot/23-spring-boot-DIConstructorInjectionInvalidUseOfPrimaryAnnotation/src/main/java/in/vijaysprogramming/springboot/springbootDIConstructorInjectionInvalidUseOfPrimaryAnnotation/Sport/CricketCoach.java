package in.vijaysprogramming.springboot.springbootDIConstructorInjectionInvalidUseOfPrimaryAnnotation.Sport;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CricketCoach implements Coach
{
    @Override
    public String getDailyWorkout()
    {
        return "CricketCoach: Practice Bowling for 30 minutes";
    }
}
