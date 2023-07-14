package in.vijaysprogramming.springboot.springbootSimpleRESTControllerWithDevTools.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgileRestController
{
    @GetMapping("/")
    public String agileDevelopment()
    {
        return "AgileDevelopment method called!";
    }

    @GetMapping("/Anonymous")
    public String anonymous()
    {
        return "anonymous method called!";
    }

    @GetMapping("/Protocol")
    public String protocol()
    {
        return "protocol method called!";
    }

    @GetMapping("/Analysis")
    public String analysis()
    {
        return "analysis method called!";
    }
}
