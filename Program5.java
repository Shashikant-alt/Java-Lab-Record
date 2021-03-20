import java.util.Scanner;

class LeapYear
{
    public boolean isLeapYear(int year)
    {
        if(((year % 4 == 0) && (year % 100 != 0)) ||(year % 400 == 0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

public class Program5
{
    public static void main(String[] args)
    {
        System.out.println("Program 5: Write a program to check if a year is a leap year or not.");
        System.out.println("\n Shashikant Solanki \n A2305219303 \n 4CSE5");
        Scanner sc = new Scanner(System.in);
        LeapYear e = new LeapYear();
        System.out.println("Enter the year : ");
        int n = sc.nextInt();
        if(e.isLeapYear(n))
        {
            System.out.printf("\n\n %d is a leap year.",n);
        }
        else
        {
            System.out.printf("\n\n %d is not a leap year.",n);
        }
    }    
}


