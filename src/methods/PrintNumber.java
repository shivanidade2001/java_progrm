package methods;


public class PrintNumber {
    public static void main(String[] args) {
        printn(4);
        printn(5d);
        printn(3f);
        printn(2455555654l);
    }
    public static void printn(int x){
        System.out.println(x);
    }
    public static void printn(double x){
        System.out.println(x);
    }
    public static void printn(float x){
        System.out.println(x);
    }
    public static void printn(long x){
        System.out.println(x);
    }
}
