package methodprogram;

public class Area {
    int length,breadth;

    void setDim( int l,int b){
   length=l;
   breadth=b;
    }
    public int getArea()
    {
        return length*breadth;
    }
    public static void main(String[]args){
     Area a=new Area();
     a.setDim(10,5);
     System.out.println("Area of rectangle="+a.getArea());
    }

}
