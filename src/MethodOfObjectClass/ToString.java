package MethodOfObjectClass;

public class ToString {
    public static void main(String[] args) {
        int number= 30;//decimal number system
        System.out.println("Binary"+" "+Integer.toBinaryString(number));
        System.out.println("Octal"+" "+Integer.toOctalString(number));
        System.out.println("Hexadecimal"+" "+Integer.toHexString(number));

        Course course= new Course();
        int hashcode=course.hashCode();
        System.out.println("Decimal hashcode"+hashcode);
        System.out.println("Hexadecimal hashcode"+" "+Integer.toHexString(hashcode));

        System.out.println(course);
    }
}
