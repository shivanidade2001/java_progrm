package methods;

public class EvenNumber {

int number;
    public static void main(String[]args){
        EvenNumber e=new EvenNumber();
         e.number=33;
    if(e.number%2==0){
        System.out.println("even number"+e.number);
    }else {
        System.out.println("odd number"+e.number);
    }

}
}
