package loop;

public class Assignment {
    public static void main(String[]args){
        for (int row=6;row>=1;row--){
            for (int column=6;column>=row;column--){
                System.out.print(column+" ");
            }
            System.out.println( );
        }
    }
}
