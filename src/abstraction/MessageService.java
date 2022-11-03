package abstraction;

public abstract class MessageService {
    int iv=100;
    static int sv=200;
    void m1(){
        System.out.println("instance method");
    }
    static void m2(){
        System.out.println("static method");
    }{
        System.out.println("instance block");
    }
    static {
        System.out.println("static block");
    }
    MessageService(){
        System.out.println("constructor");
    }
    abstract void sendMessage(String message);
     abstract void sendMessage();
}
