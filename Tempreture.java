import java.util.*;
public class Tempreture {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Enter a tempreture in fharen: ");
        float temp = input.nextFloat();
        System.out.println("Tempreture in Celsius: "+ (temp-32)/1.8);
        System.out.println("%-15d %-15.2f%n"+ (temp-32)/1.8);
        input.close();
    }
    
}
