package MethodOfObjectClass;



public class HashCode {
    public static void main(String[] args){
        Student student=new Student(1,"abc");
        Student student1=new Student(1,"abc");
       //student = student1;
        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());
    }
}
