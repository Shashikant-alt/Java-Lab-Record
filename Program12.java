import java.util.Scanner;

class Number {
    public int test(int num1) 
    {
        int ans = 0;
        while(num1!=0)
        {
            ans+=(num1%10);
            ans = ans*10;
            num1=num1/10;
        }  
        return ans/10;      
    }
}

public class Program12 {
    public static void main(String[] args) {
        System.out.println("Program 12: Write a program to reverse a number.");
        System.out.println("\n Shashikant Solanki \n A2305219303 \n 4CSE5");
        Scanner sc = new Scanner(System.in);
        Number e = new Number();
        System.out.println("Enter any number : ");
        int n1 = sc.nextInt();
        int ans = e.test(n1);
        System.out.printf("\nEntered number : %d ",n1);
        System.out.printf("\nReversed number : %d ",ans);
    }
}
