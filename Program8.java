import java.util.Scanner;

class Grade
{
    public char calculategrade(int marks)
    {
        char c = 'P';
        if(marks>=90)
            c ='A';
        else if(marks>=80)
            c ='B';
        else if(marks>=70)
            c ='C';
        else if(marks>=50)
            c ='D';
        else if(marks>=33)
            c ='E';
        else if(marks<33&&marks>=0)
            c ='F';
        return c;
    }
}


public class Program8 {
    public static void main(String[] args) {
        System.out.println("Program 8: Write a program to print grade of a student.");
        System.out.println("\n Shashikant Solanki \n A2305219303 \n 4CSE5");
        Scanner sc = new Scanner(System.in);
        System.out.println("Grading is as follows:\nA if marks>=90\nB if marks >=80 & <90\nC if marks >=70 & <80\nD if marks >=50 & <70\nE if marks >=33 & <50\nF if marks <33 and considered as fail. ");
        System.out.println("Enter the marks of student out of 100:");
        int marks = sc.nextInt();
        Grade g = new Grade();
        char ch = g.calculategrade(marks);
        if(ch == 'P')
        {
            System.out.println("Invalid Input of marks;");
        }
        else
        {
            System.out.println("Grade : "+ch);
        }
    }  
}
