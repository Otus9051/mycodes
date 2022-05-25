// Multiple Class
import java.util.*;
class Car // Development Class
{
    public void speed(int maxSpeed)
    {
        System.out.println("Max Speed: " + maxSpeed);
    }
}
public class MultiClass // Application/Main Class
{
    public static void main(String[] args)
    {
        Car c = new Car();
        c.speed(200);
    }
}