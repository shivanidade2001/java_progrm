package methods;

public class                                                                                                    vote {
    int age;
    void EligiblePrint(){
        if(18<age)
        {
            System.out.println("she is eligible for vote"+age);
        }else {

            System.out.println("she is not eligible to vote"+age);
        }
    }
    public static void main(String[]args){
        vote v=new vote();
        v.age=56;
        v.EligiblePrint();
    }
}
