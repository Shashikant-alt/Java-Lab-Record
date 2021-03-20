import java.util.Scanner;

class Number {
    public void test(int num) {
        System.out.println("Your entered number is : " + num);
        System.out.println("Pre incremented value of number is : " + ++num);
        System.out.println("Post incremented value of number is : " + num++);
        System.out.println("Pre decremented value of number is : " + --num);
        System.out.println("Post decremented value of number is : " + num--);
    }
}

public class Program10 {
    public static void main(String[] args) {
        System.out.println("Program 10: Write a program to print incremented and decremented values of a number.");
        System.out.println("\n Shashikant Solanki \n A2305219303 \n 4CSE5");
        Scanner sc = new Scanner(System.in);
        Number e = new Number();
        System.out.println("Enter any number : ");
        int n = sc.nextInt();
        e.test(n);
    }
}
