package loop;

public class pattern1 {
    public static void main(String[]args){
    for (int row=1;row<=5;row++){
        for (int column=row;column>=1;column--){
            System.out.print(column+" ");
        }
        System.out.println( );
    }
}
}
