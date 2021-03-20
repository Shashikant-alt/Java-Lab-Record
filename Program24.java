interface A 
{
    public void display1(String name);
}

interface B 
{
    public void display2(float f);
}

public class Program24 {
    public static void main(String[] args) {
        System.out.println("Program 24: Implement lambda expression in java.");
        System.out.println("\n Shashikant Solanki \n A2305219303 \n 4CSE5");
        int x = 10;
        A a1 = (name) -> {
            System.out.println("Display method of interface A displaying value of x as " + x + " and name as " + name);
        };
        a1.display1("Shashikant");
        B b1 = (f) -> {
            System.out
                    .println("Display method of interface B displaying value of x as " + x + " and value of f as " + f);
        };
        b1.display2(10.2f);
    }

}
