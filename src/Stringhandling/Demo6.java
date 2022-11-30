package Stringhandling;

public class Demo6 {
    public static void main(String[] args) {
        String str="hello";
        String str2="HELLo";
        System.out.println(str==str2);
        System.out.println(str.equals(str2));
        System.out.println("without checking the case"+" "+str.equalsIgnoreCase(str2));

        String str3=new String("hello");
        String str4=new String("hello");
        System.out.println(str3==str4);
        System.out.println(str3.equals(str3));
        System.out.println(str3.equalsIgnoreCase(str4));

        String str5="hello";
        String str6="hello";
        System.out.println(str5==str6);
        System.out.println("str5 and str6"+" "+str5.equals(str6));
        System.out.println(str3==str6);
        //equals method is overridden in string class and it does content check and not reference check
        System.out.println(str3.equals(str6));
    }
}
