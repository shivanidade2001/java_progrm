package Functionalnterface;

public class BufferedInputStream implements InputStreamOpener{
    @Override
    public boolean Open(String String) {
        return false;
    }

    public static void main(String[] args) {
        InputStreamOpener inputStreamOpener2=new BufferedInputStream();
       System.out.println( inputStreamOpener2.Open("bye"));
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
