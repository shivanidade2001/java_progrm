package Operators;

public class Assignment316 {
    public static void main(String[]args){
        int num=567 , rev=0;
        while (num!=0)
        {
            int rem = num % 10;
            rev = rev*10+rem;
            num = num /10;
        }
        System.out.println("the reverse order of the number is"+rev);
    }
}
