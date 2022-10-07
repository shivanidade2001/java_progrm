package loop;

public class Assignment34 {
    public static void main(String[] args) {
        int a = 12345;
        int sum = 0;
        for (int i = 1; i <= 5; i++) {

            int rem = i % 10;
            int num = i / 10;
                sum = sum + rem;
            System.out.println(sum);
        }
    }
}

