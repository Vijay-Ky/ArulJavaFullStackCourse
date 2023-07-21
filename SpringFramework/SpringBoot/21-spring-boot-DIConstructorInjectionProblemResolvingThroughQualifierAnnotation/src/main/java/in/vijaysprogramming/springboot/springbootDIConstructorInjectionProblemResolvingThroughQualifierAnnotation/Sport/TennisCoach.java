package in.vijaysprogramming.springboot.springbootDIConstructorInjectionProblemResolvingThroughQualifierAnnotation.Sport;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach
{
    @Override
    public String getDailyWorkout()
    {
        return "TennisCoach: Practice smash for 40 minutes";
    }
}
