package methods;

import java.util.Scanner;

public class Area {
    static void Area() {
        Scanner s=new Scanner(System.in);
        System.out.println("enter radius");
        float  radius=s.nextFloat();
        float area = (22 / 7) * radius * radius;
        System.out.println("area of circle"+area);
        float circumference = 2*(22 / 7) * radius;
        System.out.println("area of circle"+circumference);
    }
    public static void main(String[]args) {
   Area.Area();
    }
 }
