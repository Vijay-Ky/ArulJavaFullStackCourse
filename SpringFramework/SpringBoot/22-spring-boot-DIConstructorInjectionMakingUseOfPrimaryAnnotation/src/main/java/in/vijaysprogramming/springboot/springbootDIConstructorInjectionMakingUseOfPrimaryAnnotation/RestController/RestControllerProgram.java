package in.vijaysprogramming.springboot.springbootDIConstructorInjectionMakingUseOfPrimaryAnnotation.RestController;


import in.vijaysprogramming.springboot.springbootDIConstructorInjectionMakingUseOfPrimaryAnnotation.Sport.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerProgram
{
    private Coach myCoach;

    @Autowired
    public RestControllerProgram(Coach theCoach)
    {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getWorkout()
    {
        return myCoach.getDailyWorkout();
    }
}
