import java.util.Scanner;

class Area
{
    public int Areaof(int length,int breadth)
    {
        int ar = 2*(length+breadth);
        return ar;
    }
    public double Areaof(int radius)
    {
        double ar = 3.142*radius*radius;
        return ar;
    }
}

public class Program13 {
    public static void main(String[] args) {
        System.out.println("Program 13: Implement method overloading in java.");
        System.out.println("\n Shashikant Solanki \n A2305219303 \n 4CSE5");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle : ");
        int len = sc.nextInt();
        System.out.println("Enter the breadth of rectangle : ");
        int bre = sc.nextInt();
        Area a = new Area();
        System.out.println("Area of rectangle is : " + a.Areaof(len,bre));
        System.out.println("Enter radius of circle : ");
        int rad = sc.nextInt();
        System.out.println("Area of circle is : " + a.Areaof(rad));
    }
}
