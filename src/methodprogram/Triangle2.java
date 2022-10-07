package methodprogram;

public class Triangle2 {
    int side1;
    int side2;
    int side3;
    Triangle2(int s1,int s2,int s3){
         side1=s1;
         side2=s2;
         side3=s3;
    }
    int area()
    {

        return side1*side2*side3;
    }
    int perimeter()
    {
        return side1+side2+side3;
    }

    public static void main(String[] args){
        Triangle2 t=new Triangle2(4, 5, 6);
        System.out.println("area of  triangle:"+t.area());
        System.out.println("perimeter of triangle:"+t.perimeter());
    }
}
