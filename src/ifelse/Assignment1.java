package ifelse;

import java.util.Scanner;

public class Assignment1
{
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the length:");
        int length = s.nextInt();
        System.out.println("enter the breadth");
        int breadth = s.nextInt();
        if (length == breadth) {
            System.out.println("square");
        } else {
            System.out.println("square not");
        }
    }
}

