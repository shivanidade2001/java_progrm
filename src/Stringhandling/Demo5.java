package Stringhandling;

public class Demo5 {
    public static void main(String[] args) {
        String message="i am java developer";
        message=message.toUpperCase();
        System.out.println(message);

        String message2="I LIKE YOGA";
        message2=message2.toLowerCase();
        System.out.println(message2);


        String source="cyber success";
        source=source.replace("cyber","student");
        source=source.replace("success","college");

        System.out.println(source);

        String spaces ="    spaces   ";
        spaces=spaces.trim();
        //trim():using to remove spaces
        System.out.println(spaces.length());
    }
}
