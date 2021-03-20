class A1
{
    public void display()
    {
        System.out.println("Displaying am method from class A1.");
    }
}

class A2 extends A1
{
    public void display()
    {
        System.out.println("Displaying am method from class A2.");
    }
}

public class Program22 {
    public static void main(String[] args) {
        System.out.println("Program 22: Implement upcasting in java.");
        System.out.println("\n Shashikant Solanki \n A2305219303 \n 4CSE5");
        // Upcasting is the typecasting of a child object to a parent object.
        A1 a = new A2();
        a.display();
    }
}