package methodprogram;

public class Complex {
    int n1,n2;
    public int Add(){
        return n1+n2;
    }
    public int Diff(){
        return n1-n2;
    }
    public int Product(){
        return n1*n2;
    }
}  class comp{
    public static void main(String[]args){
        Complex c=new Complex();
        c.n1=56;
        c.n2=23;
        System.out.println("sum:"+c.Add()+" "+"difference"+" "+c.Diff()+" "
                +"product"+" "+c.Product());
    }
}
