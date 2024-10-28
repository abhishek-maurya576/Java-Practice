import java.util.*;
public class Method{
    public static void main(String[] x) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter  two number: ");
        int var1 = input.nextInt();
        int var2 = input.nextInt();

        int sum = add(var1, var2);
        System.out.println("The sum is: "+sum);
        input.close();

    }

    public static int add(int a, int b){
        return a + b;
    }
    public static int add(int a, int b, int c){
        return a + b + c;
    }
    public static float add(float a, float b){
        return a + b;
    }
}