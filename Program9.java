import java.util.Scanner;

class Equal
{
    public boolean isEqual()
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("\nEnter first string : ");
        String first = sc.nextLine();
        System.out.printf("\nEnter second string : ");
        String second = sc.nextLine();
        int len = first.length();
        for(int i = 0; i < len; i++)
        {
            if(first.charAt(i) != second.charAt(i))
            {
                return false;
            }
        }
        return true;
    }
}

public class Program9
{
    public static void main(String[] args)
    {
        System.out.println("Program 9: Write a program to check if two strings are equal or not.");
        System.out.println("\n Shashikant Solanki \n A2305219303 \n 4CSE5");
        Equal e = new Equal();
        if(e.isEqual())
        {
            System.out.printf("Strings are equal.");
        }
        else
        {
            System.out.printf("Strings are not equal.");
        }
    }    
}



