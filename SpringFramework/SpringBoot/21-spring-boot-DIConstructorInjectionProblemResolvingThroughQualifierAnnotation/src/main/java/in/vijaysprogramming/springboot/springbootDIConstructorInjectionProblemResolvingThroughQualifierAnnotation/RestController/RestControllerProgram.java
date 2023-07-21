package in.vijaysprogramming.springboot.springbootDIConstructorInjectionProblemResolvingThroughQualifierAnnotation.RestController;
import in.vijaysprogramming.springboot.springbootDIConstructorInjectionProblemResolvingThroughQualifierAnnotation.Sport.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerProgram
{
    private Coach myCoach;

    //@Qualifier using if multiple implementation are there then we can specify the exact bean component we want to inject through @Qualifier annotation.
    //supply the class name first letter in the lower case.
    @Autowired
    public RestControllerProgram(@Qualifier("trackCoach") Coach theCoach)
    {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getWorkout()
    {
        return myCoach.getDailyWorkout();
    }
}
