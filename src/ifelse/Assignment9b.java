package ifelse;

import java.util.Scanner;

public class Assignment9b {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Are you medical cause?yes or not?");
        char report = s.next().charAt(0);
        if (report == 'Y') {
            System.out.println("Report" + report + "\t student allow to sit in exam");
        } else if(report=='N'){
            System.out.println("Report"+report + "\t student not allow to sit in exam");
        }
    }
}