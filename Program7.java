import java.util.Scanner;

class Power
{
    public int calculatepower(int n,int p)
    {
        int val = 0;
        int temp = 1;
        while(p!=0)
        {
            val = temp*n;
            temp = val;
            p--;
        }
        return val;
    }
}

public class Program7
{
    public static void main(String[] args)
    {
        System.out.println("Program 7: Write a program to print the power of a number.");
        System.out.println("\n Shashikant Solanki \n A2305219303 \n 4CSE5");
        Scanner sc = new Scanner(System.in);
        Power p = new Power();
        System.out.printf("\nEnter number : ");
        int n = sc.nextInt();
        System.out.printf("\nEnter power : ");
        int n1 = sc.nextInt();
        int ans = p.calculatepower(n,n1);
        System.out.printf("\n %d to the power %d is : %d",n1,n,ans);
    }   
}

