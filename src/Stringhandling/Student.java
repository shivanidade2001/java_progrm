package Stringhandling;

public final class Student  {
     int id;
    private String name;
    public Student(int id, String name){
        this.id=id;
        this.name=name;
    }
    public Student(int id){
        this.id = id;
        System.out.println("student constructor");
    }
    public int setId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        Student student=new Student(3,"shiv");
        String str="abc";

    }
}
