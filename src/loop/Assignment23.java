package loop;

public class Assignment23 {
    public static void main(String[]args){
        int a= 10;
         int sum=0;
         for (int i=1;i<=a/2;i++) {
             if (a % i == 0) {
                 sum = sum + i;
             }
         }
             if(sum==a) {
                 System.out.println("perfect number" + a);
             }else{
                 System.out.println("not perfect number"+a);
         }
         }
    }

