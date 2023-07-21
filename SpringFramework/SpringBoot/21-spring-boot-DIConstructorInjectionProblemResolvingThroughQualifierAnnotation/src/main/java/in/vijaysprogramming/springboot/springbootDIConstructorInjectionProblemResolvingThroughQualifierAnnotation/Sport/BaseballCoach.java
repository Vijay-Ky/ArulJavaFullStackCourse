package in.vijaysprogramming.springboot.springbootDIConstructorInjectionProblemResolvingThroughQualifierAnnotation.Sport;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach
{
    @Override
    public String getDailyWorkout()
    {
        return "BaseballCoach: Practice squats for 10 minutes";
    }
}
