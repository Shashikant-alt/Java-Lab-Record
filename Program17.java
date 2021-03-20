import java.util.Scanner;
//Base class
class A
{
    public void displayA()
    {
        System.out.println("A class.");
    }
}
//Class Extending A class
class B extends A
{
    public void displayB()
    {
        System.out.println("B class.");
    }
}
//Class Extending A class
class C extends A
{
    public void displayC()
    {
        System.out.println("C class.");
    }
}

public class Program17{
    public static void main(String[] args) {
        System.out.println("Program 17: Implement hierarchical inheritance in java.");
        System.out.println("\n Shashikant Solanki \n A2305219303 \n 4CSE5");
        C c = new C();
        c.displayA();
        c.displayC();
    }
}

