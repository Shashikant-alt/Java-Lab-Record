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

public class Program15 extends A {
    public static void main(String[] args) {
        System.out.println("Program 15: Implement single inheritance in java.");
        System.out.println("\n Shashikant Solanki \n A2305219303 \n 4CSE5");
        Program15 b = new Program15();
        System.out.println("value of a + b : " + b.add());
    }
}

