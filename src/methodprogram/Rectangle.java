package methodprogram;
public class Rectangle {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public int getArea() {
        return length * breadth;
    }

    public int getPerimeter() {
        return 2 * (length * breadth);
    }
}
       class rect{
        public static void main(String[] args){
            Rectangle a=new Rectangle(4,5);
            Rectangle p=new Rectangle(5,8);
            System.out.println("area="+a.getArea()+" "+"perimeter="+a.getPerimeter());
            System.out.println("area="+p.getArea()+" "+"perimeter="+p.getPerimeter());
        }
}

