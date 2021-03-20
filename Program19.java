import java.util.Scanner;
//Base class
interface A
{
    public void displayA();
}
//Class Extending A class
interface B
{
    public void displayB();
}
//Class Extending A class
class C implements A,B
{
    @Override
    public void displayA()
    {
        System.out.println("A class.");
    }
    @Override
    public void displayB()
    {
        System.out.println("B class.");
    }
    public void displayC()
    {
        System.out.println("C class.");
    }
}

public class Program19{
    public static void main(String[] args) {
        System.out.println("Program 19: Implement multiple inheritance in java.");
        System.out.println("\n Shashikant Solanki \n A2305219303 \n 4CSE5");
        C c = new C();
        c.displayA();
        c.displayC();
        c.displayB();
    }
}
