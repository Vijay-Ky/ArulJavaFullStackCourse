package in.vijaysprogramming.springcore.mainpackage.RestControllerProgram;

import in.vijaysprogramming.springcore.mainpackage.Sport.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerProgram
{
    private Coach myCoach;

    @Autowired
    public RestControllerProgram(@Qualifier("swimConfig") Coach theCoach)

    {
        System.out.println("From constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout()
    {
        return myCoach.getDailyWorkout();
    }
}
