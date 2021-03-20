import java.io.*;
import java.util.*;

class Array {
    public void test() {
        ArrayList<Integer> arrli = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++)
            arrli.add(i);
        System.out.println("Displaying the content of List : ");
        System.out.println(arrli);
        arrli.remove(3);
        System.out.println("\nDisplaying the content of List after removel : ");
        System.out.println(arrli);
    }
}

public class Program25 {
    public static void main(String[] args) {
        System.out.println("Program 25: Write a program to implement ArrayList in Java.");
        System.out.println("\n Shashikant Solanki \n A2305219303 \n 4CSE5");
        Array a = new Array();
        a.test();
    }
}