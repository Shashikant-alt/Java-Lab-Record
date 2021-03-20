import java.util.Scanner;

class EvenOdd
{
    public boolean isEven(int n)
    {
        if(n%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

public class Program2
{
    public static void main(String[] args)
    {
        System.out.println("Program 2: Write a program to check whether a number is even or odd.");
        System.out.println("\n Shashikant Solanki \n A2305219303 \n 4CSE5");
        Scanner sc = new Scanner(System.in);
        EvenOdd e = new EvenOdd();
        System.out.println("Enter any number : ");
        int n = sc.nextInt();
        if(e.isEven(n))
        {
            System.out.printf("\n\n %d is an even number.",n);
        }
        else
        {
            System.out.printf("\n\n %d is an odd number.",n);
        }
    }    
}

