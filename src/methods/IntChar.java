package methods;

public class IntChar {
    public static void main(String[] args) {
        PrintNumber(5,'A');
        PrintNumber('x',3);
    }
    private static void PrintNumber(int n, char c){
        System.out.println("integer:"+n+"\t"+"char:"+c);
    }
    private static void PrintNumber(char c,int n){
        System.out.println("char:"+c+"\t"+"integer:"+n);
    }
}
