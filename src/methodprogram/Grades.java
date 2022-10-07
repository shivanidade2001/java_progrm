package methodprogram;

import java.util.Scanner;

public class Grades {
    void display() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter her marks");
        int mark = s.nextInt();
        String G="0";
        if (mark >= 91) {
            G = "AA";
        } else if (mark <= 90 && mark > 81) {
             G = "AB";
        } else if (mark <= 80 && mark > 71) {
            G = "BB";
        } else if (mark <= 70 && mark > 61) {
            G = "BC";
        } else if (mark <= 60 && mark > 51) {
            G = "CD";
        } else if (mark <= 50 && mark > 41) {
            G = "DD";
        } else if (mark <= 41) {
            G = "Fail";
        }System.out.println("grade:"+G);
    }

    public static void main(String[]args){
        Grades g=new Grades();
        g.display();
    }
}
