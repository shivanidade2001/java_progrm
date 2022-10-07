package loop;
import  java.util.Scanner;
    public class Assignment35 {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("enter the number");
            int i=s.nextInt();
            int sum=0;
            while ( i>0) {

                int rem = i % 10;
                sum = sum + rem;
                i = i / 10;
            }
            System.out.println("sum og digit"+sum);
        }
    }
    /*sum of given digits

     */