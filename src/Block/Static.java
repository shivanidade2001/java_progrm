package Block;

public class Static {
    {
        System.out.println("instance block");
    }static {
        System.out.println("Static block");
    }
    public Static(){
        System.out.println("constructor");
    }public Static(int n){
    }

    public static void main(String[] args) {
        Static s=new Static();

    }
}
