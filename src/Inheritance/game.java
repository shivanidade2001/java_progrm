package Inheritance;

public class game {
    void m3(){
        System.out.println("m3 constructor");
    }
}class BoardGame extends game{
    void m2(){
        System.out.println("m2 constructor");
    }
} class Chess extends BoardGame {
    void m1(){
        System.out.println("m1 constructor");
    }
    public static void main(String[] args) {
    Chess chess=new Chess();
    chess.m1();
    chess.m2();
    chess.m3();
    }
}