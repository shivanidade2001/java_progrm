package Interface;

public interface MessageService {

}interface I1{
    public static class A{ }
}interface I2{
    static class A{ }
}
class C implements I1,I2{
    public C(){
        super();
    }

    public static void main(String[] args) {
        C c=new C();
    }
}
