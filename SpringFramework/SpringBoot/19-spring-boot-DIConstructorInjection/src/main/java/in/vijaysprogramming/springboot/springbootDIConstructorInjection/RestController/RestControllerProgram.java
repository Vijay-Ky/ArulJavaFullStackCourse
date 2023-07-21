package in.vijaysprogramming.springboot.springbootDIConstructorInjection.RestController;

import in.vijaysprogramming.springboot.springbootDIConstructorInjection.Sport.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerProgram
{
    private Coach myCoach;

    //constructor injection
    @Autowired
    public RestControllerProgram(Coach theCoach)
    {
        myCoach = theCoach;
    }

    @GetMapping("/getworkout")
    public String getWorkout()
    {
        return myCoach.getDailyWorkout();
    }
}
