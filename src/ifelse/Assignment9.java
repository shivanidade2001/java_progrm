package ifelse;
import java.util.Scanner;
public class Assignment9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("number of classes held");
        int a = s.nextInt();
        System.out.println("number of classes attended");
        int b = s.nextInt();
        float percentage;
        percentage = (a/b) * 100;
        if (percentage <= 75) {
            System.out.println("student allow to sit in exam" + percentage);
        } else {
            System.out.println("student not allow to in exam"  + percentage);
        }

    }
}