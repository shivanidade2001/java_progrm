package methodprogram;

public class employee {
    String name;
    int year;
    String address;

    public static void main(String[]args){
        employee e1=new employee();
        employee e2=new employee();
        employee e3=new employee();
        e1.name="Robert";
        e1.year=1994;
        e1.address="64C-WallsStreet";
        e2.name="Sam";
        e2.year=2000;
        e2.address="68d-WallsStreet";
        e3.name="John";
        e3.year=1999;
        e3.address="26B-WallsStreet";
        System.out.println("Name\tYear of joining\tAddress");
        System.out.println(e1.name+"\t"+e1.year+"\t\t\t"+e1.address);
        System.out.println(e2.name+"\t\t"+e2.year+"\t\t\t"+e2.address);
        System.out.println(e3.name+"\t"+e3.year+"\t\t\t"+e3.address);
    }
}
