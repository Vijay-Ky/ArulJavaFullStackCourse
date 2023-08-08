package in.vijaysprogramming.springboot.springbootPrimaryVSQulifierAnnotation.RestControllerProgram;

import in.vijaysprogramming.springboot.springbootPrimaryVSQulifierAnnotation.Sport.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerProgram
{
    private Coach myCoach;

    @Autowired
    //specify the bean id: BaseballCoach or any other class that implements Coach
    //Same name as class, first character lower-case
    //public RestControllerProgram(@Qualifier("baseballCoach") Coach theCoach)
    //public RestControllerProgram(@Qualifier("cricketCoach") Coach theCoach)
    public RestControllerProgram(@Qualifier("tennisCoach") Coach theCoach)
    {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
