package loop;

import java.util.Scanner;

public class employeeD {
    private String name;
    private float salary,hours;
    public employeeD(){
        name=" ";
        salary=0;
        hours=0;
    }public void getInfo(String n,float sal,float hr){
        name=n;
        salary=sal;
        hours=hr;
    }public float AddSal(){
        if (salary>500){
            salary=salary+10;
        }return salary;
    }public float AddWork(){
        if (hours<6){
            salary=salary+5;
        }return salary;
    }
}
class TestEmployee{
    float salary;
    public TestEmployee(float sal){
        salary=sal;
    }
    public void printSal(){
        System.out.println("Salary"+salary);
    }
} class emp{
    public static void main(String[]args){
        employeeD e=new employeeD();
        Scanner s= new Scanner(System.in);
        System.out.println("enter name");
        String name=s.nextLine();
        System.out.println("enter salary");
        float salary=s.nextInt();
        System.out.println("enter no. of hours of work");
        float hours=s.nextFloat();
        e.getInfo(name,salary,hours);
        salary=e.AddSal();
        salary=e.AddWork();
        TestEmployee test=new TestEmployee(salary);
        test.printSal();
    }
}