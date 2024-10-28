import java.util.*;
public class InputArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();
        int sum = 0;
        int[] arr = new int[n];
        System.out.print("Enter an element of an array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("The sum of all numbers: "+sum);
        sc.close();
    }
    
}
