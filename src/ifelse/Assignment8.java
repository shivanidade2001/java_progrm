package ifelse;
import java.util.Scanner;
public class Assignment8 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter age Gender, Marital Status");
        int age = s.nextInt();
        char gender=s.next().charAt(0);
        char maritalStatus = s.next().charAt(0);
        if(gender=='F'){
        System.out.println("Gender"+gender+"\t will work in urban area");
        } else if (gender=='M'&& (age>20 && age<40)) {
            System.out.println("Gender"+gender+"\t will work anywhere");
        } else if (gender=='M' &&(age>40 && age<60)) {
            System.out.println("Gender"+gender+"\t will work in urban area" );

        } else {
            System.out.println("ERROR");
        }

        }
    }
