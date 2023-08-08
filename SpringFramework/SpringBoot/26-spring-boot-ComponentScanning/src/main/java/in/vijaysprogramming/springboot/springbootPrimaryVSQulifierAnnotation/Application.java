package in.vijaysprogramming.springboot.springbootPrimaryVSQulifierAnnotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"in.vijaysprogramming.springboot.springbootPrimaryVSQulifierAnnotation", "in.vijaysprogramming.util"})
public class Application
{

	public static void main(String[] args)
	{
		SpringApplication.run(Application.class, args);
	}

}
