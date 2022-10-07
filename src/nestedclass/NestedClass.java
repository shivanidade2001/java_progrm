package nestedclass;

public class NestedClass {
    static class Mysql{
        static String USERNAME ="Mysql";
        static String PASSWORD = "Admin";
    }static class Oracle{
        static String USERNAME="Oracle";
        static String PASSWORD="Admin";
    }static class Prosgress{
       static class Dev {
           static String USERNAME = "Oracle";
           static String PASSWORD = "Admin";
       }static class Prod{
                static String USERNAME="Oracle";
                static String PASSWORD="Admin";
        }
    }

    public static void main(String[] args) {
        System.out.println(Mysql.USERNAME);
        System.out.println(Mysql.PASSWORD);
        System.out.println(Oracle.USERNAME);
        System.out.println(Oracle.PASSWORD);
        System.out.println(Prosgress.Dev.USERNAME);
        System.out.println(Prosgress.Prod.PASSWORD);
    }
}
