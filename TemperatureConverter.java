public class TemperatureConverter {
    public static void main(String[] args) {
        // Define the range of Fahrenheit values
        int[] fahrenheitValues = {32, 50, 68, 86, 104};

        // Print the table header
        System.out.printf("%-15s %-15s%n", "Fahrenheit", "Celsius");

        // Convert each Fahrenheit value to Celsius and print the result
        for (int fahrenheit : fahrenheitValues) {
            double celsius = (fahrenheit - 32) / 1.8;
            System.out.printf("%-15d %-15.2f%n", fahrenheit, celsius);
        }
    }
}
