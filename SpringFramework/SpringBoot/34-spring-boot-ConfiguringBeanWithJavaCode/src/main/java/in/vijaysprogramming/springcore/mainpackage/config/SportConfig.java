package in.vijaysprogramming.springcore.mainpackage.config;

import in.vijaysprogramming.springcore.mainpackage.Sport.Coach;
import in.vijaysprogramming.springcore.mainpackage.Sport.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig
{
    @Bean
    public Coach swimCoach()
    {
        return new SwimCoach();
    }
}
