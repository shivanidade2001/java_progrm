package loop;

public class Assignment25 {
public static void main(String[]args){
    int n1=14;
    int n2=7;
    int q=0;
    while (n1>=n2){
        n1=n1-n2;
        q++;
    }
    System.out.println("quotient is"+q);
    System.out.println("remainder is"+n1);
}
}
