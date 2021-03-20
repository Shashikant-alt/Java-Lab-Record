import java.util.Scanner;

class Vowel
{
    public boolean isVowel(char ch)
    {
        if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I'|| ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') 
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

public class Program6
{
    public static void main(String[] args)
    {
        System.out.println("Program 6: Write a program to check whether a character is a vowel or a consonant.");
        System.out.println("\n Shashikant Solanki \n A2305219303 \n 4CSE5");
        Scanner sc = new Scanner(System.in);
        Vowel e = new Vowel();
        System.out.println("Enter a character : ");
        char n = sc.next().charAt(0);
        if(e.isVowel(n))
        {
            System.out.printf("\n\n %c is a Vowel.",n);
        }
        else
        {
            System.out.printf("\n\n %c is a consonant.",n);
        }
    }    
}


