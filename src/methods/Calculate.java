package methods;

public class Calculate {
    public static void main(String[] args) {
   taxCalculator(200000, 500000);
    }

    private static void taxCalculator(int x, int y) {
        
        if (0 < x && x <= 100000) {
            System.out.println("no tax");
        } else if (100000 < x && x <= 200000) {
            float tax = (float) (.10) * (x - 100000);
            System.out.println(tax);
        } else if (200000 < x && x <= 500000) {
            float tax = (float) ((float) (10000) + (.20) * (x - 200000));
        } else {
            float tax = (float) ((float) 10000 + 60000 + (.30) * (x - 500000));
        }
        int grossSalary = x;
        int savingSalary = y;
    }
}