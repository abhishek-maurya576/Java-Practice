import java.util.Scanner;

public class Q1 {
    
    public static void main(String[] args) {
        double sum = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = input.nextDouble();
        if(num>0){
        for(int i = 1; i <= num; i++){
            sum = sum+i;
        }
        double res = 1/sum;
        String formateString = String.format("%.2f", res);
        System.out.println(formateString);
    }else {
        System.out.println("Invalid input");

    }
        input.close();
    }
    
}
