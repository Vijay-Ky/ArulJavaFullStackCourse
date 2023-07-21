package in.vijaysprogramming.springboot.springbootDIConstructorInjectionProblem.Sport;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach
{
    @Override
    public String getDailyWorkout() {
        return "CricketCoach: Practice Bowling for 30 minutes";
    }
}
