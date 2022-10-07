package Inputbyuser;
import java.util.Scanner;
public class Assignment405 {
    public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("enter the value:");
    int side = s.nextInt();
    int area = side*side;
    System.out.println(area);
    int perimeter = 4*side;
    System.out.println(perimeter);

    }
}