package loop;
import java.util.Scanner;
public class Assignment21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = s.nextInt();
        int sum = 0,num=1,count=0;
        while(count<n) {
            if (num% 2 == 0) {
              sum= sum + num;
                count++;
            }
            num++;
        }
            System.out.println(sum);
        }
    }
