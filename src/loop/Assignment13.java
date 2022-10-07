package loop;

public class Assignment13 {
    public static void main(String[] args) {
        int number;
        System.out.println("armstrong numbers between 1 to 500");
        for (int i = 1; i <= 500; i++)
        {

                number = i;
                int sum = 0;
                while (number!= 0) {
                    int b= number % 10;
                    sum = sum + (b * b * b);
                    number = number / 10;
                }
                if (sum == i) {
                    System.out.println(i);
                }

        }
    }
}