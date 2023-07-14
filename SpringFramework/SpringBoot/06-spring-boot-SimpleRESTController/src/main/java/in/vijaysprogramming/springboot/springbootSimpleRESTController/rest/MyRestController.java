package in.vijaysprogramming.springboot.springbootSimpleRESTController.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController
{
    @GetMapping("/")
    public String Authentication()
    {
        return "Authentication is Granted!!";
    }

//    @GetMapping("/")
//    public String APIAccess()
//    {
//        return "APIAccess Granted!!";
//    }

    @GetMapping("/APIAccess")
    public String APIAccess()
    {
        return "APIAccess Granted!!";
    }

    @GetMapping("/Intelligence")
    public String springIntelligence()
    {
        return "Running springIntelligence";
    }


}
