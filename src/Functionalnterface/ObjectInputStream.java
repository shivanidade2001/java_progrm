package Functionalnterface;

public class ObjectInputStream implements InputStreamOpener {
    @Override
    public boolean Open(String String) {
        return false;
    }

    public static void main(String[] args) {
        InputStreamOpener inputStreamOpener1 = new ObjectInputStream();
        System.out.println(inputStreamOpener1.Open("hello"));
        InputStreamOpener inputStreamOpener3=new InputStreamOpener() {
            @Override
            public boolean Open(String String) {
                return false;
            }
        };
        System.out.println(inputStreamOpener3.Open("anonymous way"));
        InputStreamOpener lam=(String)->{
            return false;
        };
        System.out.println(lam.Open("lambda Expression"));
    }
}