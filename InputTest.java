import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter something: ");
        System.out.flush();  // Ensure prompt is printed before input
        String userInput = input.nextLine();
        System.out.println("You entered: " + userInput);
        input.close();
    }
}
