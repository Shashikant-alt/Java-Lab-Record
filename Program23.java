interface A
{
    public void displayA();
}

interface B
{
    public void displayB();
}

class C implements A,B
{
    @Override
    public void displayA()
    {
        System.out.println("A class method in class C.");
    }
    @Override
    public void displayB()
    {
        System.out.println("B class method in class C.");
    }
}

class D extends C
{
    @Override
    public void displayA()
    {
        System.out.println("A class method in class D.");
    }
    @Override
    public void displayB()
    {
        System.out.println("B class method in class D.");
    }
}

public class Program23 {
    public static void main(String[] args) {
        System.out.println("Program 23: Implement runtime polymorphism in java.");
        System.out.println("\n Shashikant Solanki \n A2305219303 \n 4CSE5");
        // Upcasting is the typecasting of a child object to a parent object.
        C c = new D();
        c.displayA();
        c.displayB();
    }
}