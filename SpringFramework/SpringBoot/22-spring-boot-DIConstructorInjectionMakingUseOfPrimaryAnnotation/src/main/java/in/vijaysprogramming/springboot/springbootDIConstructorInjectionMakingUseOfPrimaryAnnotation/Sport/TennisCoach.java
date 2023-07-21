package in.vijaysprogramming.springboot.springbootDIConstructorInjectionMakingUseOfPrimaryAnnotation.Sport;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach
{
    @Override
    public String getDailyWorkout()
    {
        return "TennisCoach: Practice smash for 30 minutes";
    }
}
