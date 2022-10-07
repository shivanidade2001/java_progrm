package methods;

public class Square {
    public static void main(String[] args) {
        printArea(5,6);
        printArea(6);
    }public static void printArea(int l,int b){
        int area=l*b;
        System.out.println("area of rectangle"+area);
    }public static void printArea(int s){
        int area=s*s;
        System.out.println("area of square"+area);
    }
}
