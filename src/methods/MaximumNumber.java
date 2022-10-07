package methods;

import java.util.Scanner;

public class MaximumNumber {
    int number1;
    int number2;
    int number3;
    void setValues(int n1, int n2,int n3) {
        number1 = n1;
        number2 = n2;
        number3 = n3;
    }
    void Max(){
            if (number1>=number2 && number1>=number3) {
                System.out.println("maximum number is:" + number1);
            }
        }
        void Min (){
            if (number2 <= number1 && number2 <= number3) {
                System.out.println("minimum number is:" + number2);
            }else {
                System.out.println("maximum number is:"+number3);
            }
        }


    public static void main(String[]args){
    MaximumNumber m=new MaximumNumber();
     m.setValues(72,45,65);
     m.Max();
     m.Min();
    }
}

