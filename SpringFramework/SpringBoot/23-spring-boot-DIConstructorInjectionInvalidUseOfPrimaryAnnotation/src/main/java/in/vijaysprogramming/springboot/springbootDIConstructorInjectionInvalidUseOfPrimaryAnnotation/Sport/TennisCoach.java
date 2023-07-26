package in.vijaysprogramming.springboot.springbootDIConstructorInjectionInvalidUseOfPrimaryAnnotation.Sport;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TennisCoach implements Coach
{
    @Override
    public String getDailyWorkout()
    {
        return "TennisCoach: Practice smash for 30 minutes";
    }
}
