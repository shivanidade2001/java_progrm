package loop;

public class pattern2 {
    public static void main(String[]args){
        for (int row=1;row<=5;row++){
            for (int column=1;column<=row;column++){
                System.out.print(column+" ");
            }
            System.out.println( );
        }
        for (int i=4;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println( );
        }
    }
}
