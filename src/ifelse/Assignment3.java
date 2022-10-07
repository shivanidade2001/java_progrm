package ifelse;
import java.util.Scanner;
public class Assignment3
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the product quantity");
        int quantity = s.nextInt();
        System.out.println("enter the product price");
        int productPrice = s.nextInt();
        int billAmount = productPrice * quantity;
        float finalBillAmount=0;
        if(billAmount>1000)
        {
            finalBillAmount = (float) (billAmount-billAmount*0.1);
        }
        else {
            finalBillAmount = billAmount;
        }
              System.out.println("Bill amount"+finalBillAmount);

    }
}
