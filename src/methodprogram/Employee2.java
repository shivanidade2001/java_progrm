package methodprogram;

import java.util.Scanner;

public class Employee2 {
    int hour;
    String name;
    int salary;
    void  getInfo(int h,String n,int s){
        hour=h;
        salary=s;
        name=n;
    }
        void AddSal() {
            if (salary < 500) {
                salary = salary + 10;
            }
        }
        void workHour(){
            if (hour>6){
                salary=salary+5;
            }

        }

    public static void main(String[]args){
        Employee2 employee2=new Employee2();
        employee2.getInfo(7,"shivani",400);
        employee2.AddSal();
         System.out.println("Salary"+employee2.salary);
         employee2.workHour();
        System.out.println("Salary"+employee2.salary);
    }

}
