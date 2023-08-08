package in.vijaysprogramming.springboot.springbootPrimaryVSQulifierAnnotation.Sport;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CricketCoach implements Coach
{
    @Override
    public String getDailyWorkout()
    {
        return "CricketPractice: Practice batting 30 minutes";
    }
}
