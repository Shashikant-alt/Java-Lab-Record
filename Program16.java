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
    int c = 30;
    int d = 40;
    public int add()
    {
        return a+b;
    }
}

public class Program16 extends B{
    public int add()
    {
        return a+b+c+d;
    }
    public static void main(String[] args) {
        System.out.println("Program 16: Implement multi-level inheritance in java.");
        System.out.println("\n Shashikant Solanki \n A2305219303 \n 4CSE5");
        Program16 b = new Program16();
        System.out.println("value of a+b+c+d : " + b.add());
    }
}
