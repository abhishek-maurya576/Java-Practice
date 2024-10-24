import java.util.*;
public class Price{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a price: ");
        float p = input.nextFloat();
        System.out.println("The price in paise is: "+p*100);
        input.close();
    }

}