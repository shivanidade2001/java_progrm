package Stringhandling;
public class Demo3 {
    public static void main(String[] args) {
        //with this line two objects are created one in heap and one in scp
        String str1 = new String("abc");
        System.out.println("object created inside the heap" +" "+System.identityHashCode(str1));
        //get the reference of an object created inside the scp
        String intern=str1.intern();
        System.out.println("object created inside the scp" +" "+System.identityHashCode(intern));
        String str2="abc";
        String str3="xyz";
        System.out.println("object created inside the scp" +" "+System.identityHashCode(str2));

    }
}
