package Stringhandling;

public class Demo8charAt {
    public static void main(String[] args) {
        String str1="this is the demo";
        char[] charArray=str1.toCharArray();
        for (int i=0;i< charArray.length;i++ ){

            System.out.println(charArray[i]);
        }
        String str2 = new String(charArray);

    }
}
