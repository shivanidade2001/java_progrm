package Stringhandling;

public class Demo2 {
    public static void main(String[] args) {
        //using new keyword object will be created in HEAP memory area
        String str=new String("abc");
        System.out.println(str);
        //using literal way
        //only String class  objects can be created with the literal way
        //  string class objects will be stored in SCP & not in HEAP
        String str2="abc";
        System.out.println(str2);
    }
}
