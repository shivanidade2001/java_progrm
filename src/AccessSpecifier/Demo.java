package AccessSpecifier;
//Encapsulation
public class Demo {
   private String name;
   private int age;
   private String address;
   public void setName(String name){
       this.name=name;
   }public String getName(){
       return name;
    }public int getAge(){
       return age;
    }public void setAge(int age){
       this.age=age;
    }public void setAddress(String address){
       this.address=address;
    }
    public String getAddress(){
       return address;
    }

    public static void main(String[] args) {
        Demo demo=new Demo();
        demo.setName("abc");
        demo.setAge(45);
        demo.setAddress("pune");
        System.out.println(demo.getName());
        System.out.println(demo.getAge());
        System.out.println(demo.getAddress());
    }
}
