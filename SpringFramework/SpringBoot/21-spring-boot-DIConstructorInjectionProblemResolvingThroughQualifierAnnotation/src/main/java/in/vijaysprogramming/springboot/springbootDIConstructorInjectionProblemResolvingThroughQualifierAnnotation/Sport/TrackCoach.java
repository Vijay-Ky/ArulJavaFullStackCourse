package in.vijaysprogramming.springboot.springbootDIConstructorInjectionProblemResolvingThroughQualifierAnnotation.Sport;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach
{
    @Override
    public String getDailyWorkout()
    {
        return "TrackCoach: Practice running for 40 minutes";
    }
}
