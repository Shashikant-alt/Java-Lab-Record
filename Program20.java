import java.util.Scanner;

interface A
{
    public void displayA();
}

interface B
{
    public void displayB();
}

interface C extends A,B
{
    public void displayC();
}

class D implements C
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
    @Override
    public void displayC()
    {
        System.out.println("C class.");
    }
    public void displayD()
    {
        System.out.println("D class.");
    }
}

public class Program20{
    public static void main(String[] args) {
        System.out.println("Program 20: Implement multiple inheritance in java through interface and class.");
        System.out.println("\n Shashikant Solanki \n A2305219303 \n 4CSE5");
        D c = new D();
        c.displayA();
        c.displayB();
        c.displayC();
        c.displayD();
    }
}
