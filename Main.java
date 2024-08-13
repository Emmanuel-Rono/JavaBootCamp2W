
//abstract class- cannot be instantiated
//Only can be extended and inherited

abstract class MotorBike
{
    abstract void Brake();
}
 
 // subclas that brings implementation of the supeClass
class SportBike extends MotorBike{
public void Brake() 
{
    	System.out.println("Brake Working Well");
}}

public class Main 
{
    public static void main(String[] args)
    {
SportBike Sp1 = new SportBike();
Sp1.Brake();
}}

