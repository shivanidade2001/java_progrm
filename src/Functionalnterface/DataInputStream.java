package Functionalnterface;

public class DataInputStream implements InputStreamOpener {
    @Override
    public boolean Open(String String) {
        return false;

    }

    public static void main(String[] args) {
        InputStreamOpener inputStreamOpener=new DataInputStream();
        System.out.println(inputStreamOpener.Open("hii"));
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
