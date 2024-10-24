import java.util.*;
public class Sum {
        public static void main(String[] x) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("The sum of "+a+" and "+b+" is "+(a+b));
        input.close();
    }
}
