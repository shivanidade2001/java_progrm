package Stringhandling;

public class Demo7compareTo {
    public static void main(String[] args) {
        String str1= "A";
        String str2="a";
        String str3="a";

        //compareTo method returns integer value
        //it compares the string based on unicode ascii value
        // positive: when first string value is bigger than compare to second value
        // negative: when first string value is smaller than compare to second value
        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str3));
        System.out.println(str2.compareTo(str1));
    }
}
