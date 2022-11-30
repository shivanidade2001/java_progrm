package Stringhandling;

public class Demo4 {
    public static void main(String[] args) {
        String str = "abc";
        //at this line toString():because toString() is overridden inside  the string
        System.out.println(str.toString());
        String greeting="good morning";
        System.out.println("length of string" +" "+ greeting.length());

        char[] array={6,8};
        System.out.println(array.length);

        String str1="hello";
        System.out.println(str1);

        str1 ="hello again";
        System.out.println(str1);

        String name = "Shivani"+" ";
        name=name+"Ramchandra";
        name=name.concat(" "+"Dade");
        System.out.println(name);
        }
}
