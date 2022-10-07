package methodprogram;

public class Triangle {
    int a1,b1,c1;
     int area(){
     return a1*b1*c1;
     }
     int perimeter(){
         return a1+b1+c1;
     }
     void setValues(int a,int b,int c){
         a1=a;
         b1=b;
         c1=c;
     }
            public static void main(String[] args){
                Triangle t=new Triangle();
                t.setValues(4,5,6);
               System.out.println("area of  triangle:"+t.area());
               System.out.println("perimeter of triangle:"+t.perimeter());
            }
        }




