package in.vijaysprogramming.springboot.springbootDIConstructorInjectionProblemResolvingThroughQualifierAnnotation.Sport;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach
{
    @Override
    public String getDailyWorkout()
    {
        return "CricketCoach: Practice batting for 20 minutes";
    }
}
