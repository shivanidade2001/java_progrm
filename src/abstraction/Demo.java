package abstraction;

public class Demo {
    public static void main(String[] args) {
        MessageService messageService=new MessageServiceImpl();
        System.out.println(messageService.iv);
        System.out.println(MessageService.sv);
        messageService.m1();
        MessageService.m2();
        messageService.sendMessage("hello");
    }
}
