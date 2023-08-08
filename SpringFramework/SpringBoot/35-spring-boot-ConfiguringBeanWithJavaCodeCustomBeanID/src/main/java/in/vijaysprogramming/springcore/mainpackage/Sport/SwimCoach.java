package in.vijaysprogramming.springcore.mainpackage.Sport;

public class SwimCoach implements in.vijaysprogramming.springcore.mainpackage.Sport.Coach
{
    public SwimCoach()
    {
        System.out.println("From constructor: " + getClass().getSimpleName());
    }
    public String getDailyWorkout()
    {
        return "SwimCoach: Swim for 100 meters";
    }
}

