package ifelse;

public class Assignment13 {
    public static void main(String[]args){
        int n=9876,reverse=0;
        while (n!=0){
            int remainder = n%10;
            reverse = reverse*10+remainder;
            n = n/10;
        }
        System.out.println("the reverse of the given number is:"+reverse);
    }
}
