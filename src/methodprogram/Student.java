package methodprogram;

public class Student {
    String name;
    int roll_no;
    long P_no;
    String address;
}
    class stud{
    public static void main(String[]args){
        Student Sam=new Student();
        Student john=new Student();
        Sam.roll_no=1;
        Sam.P_no=4353655587l;
        Sam.address="pune";
        john.roll_no=2;
        john.P_no=2345657782l;
        john.address="Satara";
        System.out.println("name"+" "+"roll_no"+" "+"p_no"+"     "+"address");
        System.out.println("Sam"+"  "+Sam.roll_no+"      "+ Sam.P_no+" "+Sam.address);
        System.out.println("John"+"  "+john.roll_no+"     "+ john.P_no+" "+john.address);
    }
}
