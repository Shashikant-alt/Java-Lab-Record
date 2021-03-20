import java.util.Scanner;

class Prime
{
    public boolean isPrime(int n)
    {
        for(int i=2; i<=n/2; i++)
        {
            if(n%i == 0)
            {
                return false;
            }
        }
        return true;
    }
}

public class Program3
{
    public static void main(String[] args)
    {
        System.out.println("Program 3: Write a program to print prime numbers from 1 to a given number.");
        System.out.println("\n Shashikant Solanki \n A2305219303 \n 4CSE5");
        Scanner sc = new Scanner(System.in);
        Prime p = new Prime();
        System.out.println("Enter the upper limit : ");
        int n = sc.nextInt();
        System.out.printf("\n\nPrime numbers between 1 and %d : \n ",n);
        int i = 2;
        while(i <= n)
        {
            if(p.isPrime(i))
            {
                System.out.println(i);
            }
            i++;
        }
    }    
}


