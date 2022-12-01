package MethodOfObjectClass;

public class GetClassMethod {
    public static void main(String[] args) {
        GetClassMethod getClassMethod=new GetClassMethod();
        Class course=getClassMethod.getClass();
        System.out.println(course.getName());
    }
}
