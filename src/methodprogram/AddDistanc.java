package methodprogram;

public class AddDistanc {
    float n1;
    float n2;
    void add(){
        float sum=n1+n2;
        System.out.println(sum);
    }
    public static void main(String[]args){
        AddDistanc addDistanc=new AddDistanc();
        addDistanc.n1=4.5f;
        addDistanc.n2=2.5f;
        addDistanc.add();
    }
}
