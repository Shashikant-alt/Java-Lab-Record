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

public class Program18 extends B{
    public static void main(String[] args) {
        System.out.println("Program 18: Implement hybrid inheritance in java.");
        System.out.println("\n Shashikant Solanki \n A2305219303 \n 4CSE5");
        C c = new C();
        Program18 p = new Program18();
        c.displayA();
        c.displayC();
        p.displayB();
    }
}
