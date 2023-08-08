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
    public RestControllerProgram(@Qualifier("swimCoach") Coach theCoach)
    {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout()
    {
        return myCoach.getDailyWorkout();
    }
}
