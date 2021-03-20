import java.util.Scanner;

class Fibonacci
{
    public void fibonacciterms(int n)
    {
        n = n - 2;
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        while(n!=0)
        {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
            n--;
        }
    }
}

public class Program4
{
    public static void main(String[] args)
    {
        System.out.println("Program 4: Write a program Fibonacci series.");
        System.out.println("\n Shashikant Solanki \n A2305219303 \n 4CSE5");
        Scanner sc = new Scanner(System.in);
        Fibonacci p = new Fibonacci();
        System.out.println("Enter the upper limit : ");
        int n = sc.nextInt();
        System.out.printf("\n\nFibonacci numbers upto %d terms : \n",n);
        p.fibonacciterms(n);
    }    
}


