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

public class Program1
{
    public static void main(String[] args)
    {
        System.out.println("Program 1: Write a program to print prime numbers between 1 and 50.");
        System.out.println("\n Shashikant Solanki \n A2305219303 \n 4CSE5");
        int i = 2;
        Prime p = new Prime();
        System.out.println("Prime numbers between 1 and 50 : ");
        while(i <= 50)
        {
            if(p.isPrime(i))
            {
                System.out.println(i);
            }
            i++;
        }
    }    
}