import java.util.Scanner;

class Number {
    public int test(int num1, int num2) 
    {
        int ans = (num1>num2)?num1:num2;
        return ans;
    }
}

public class Program11 {
    public static void main(String[] args) {
        System.out.println("Program 11: Write a program to print greater number between two using ternary operators.");
        System.out.println("\n Shashikant Solanki \n A2305219303 \n 4CSE5");
        Scanner sc = new Scanner(System.in);
        Number e = new Number();
        System.out.println("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int n2 = sc.nextInt();
        int ans = e.test(n1,n2);
        System.out.printf("\n%d is greater.",ans);
    }
}
