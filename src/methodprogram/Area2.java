package methodprogram;

import java.util.Scanner;

public class Area2 {
        int length,breadth;
        Area2(int l, int b)
        {
            length =l;
            breadth=b;
        }
        public int getArea2() {
            return length * breadth;
        }
        public static void main(String[]args){
            Scanner s= new Scanner(System.in);
            System.out.println("enter length");
            int l=s.nextInt();
            System.out.println("enter breadth");
            int b=s.nextInt();
            Area2 a=new Area2(l,b);
            System.out.println("area"+" "+a.getArea2());
        }

    }
