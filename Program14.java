import java.util.Scanner;

class A
{
    int a = 10;
    int b = 20;
    public int add()
    {
        return a+b;
    }
}

class B extends A
{
    public int add()
    {
        return a*b;
    }
}

public class Program14 {
    public static void main(String[] args) {
        System.out.println("Program 14: Implement method overriding in java.");
        System.out.println("\n Shashikant Solanki \n A2305219303 \n 4CSE5");
        B b = new B();
        //implementing method overriding.
        System.out.println("value of a*b : " + b.add());
    }
}
