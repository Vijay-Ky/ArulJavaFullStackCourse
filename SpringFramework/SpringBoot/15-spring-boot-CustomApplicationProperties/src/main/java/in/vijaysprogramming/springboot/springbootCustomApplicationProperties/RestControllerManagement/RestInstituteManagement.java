package in.vijaysprogramming.springboot.springbootCustomApplicationProperties.RestControllerManagement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestInstituteManagement
{
    @Value("${trainer.name}")
    private String trainerName;

    @Value("${course.name}")
    private String courseName;

    @Value("${institute.name}")
    private String instituteName;

    @Value("${time.duration}")
    private String timeDuration;

    @GetMapping("/courseInfo")
    public String getCourseInfo()
    {
        return "Find the below details \nTrainer Name :: " + trainerName + " Course Name:: " + courseName + " Institute Name:: " + instituteName + " Course Duration:: " + timeDuration;
    }
}
