import java.util.Scanner;

public class EOQ_TBO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter demand rate (items per unit time): ");
        double demandRate = scanner.nextDouble();

        System.out.print("Enter setup costs (per order): ");
        double setupCosts = scanner.nextDouble();

        System.out.print("Enter holding cost (per item per unit time): ");
        double holdingCost = scanner.nextDouble();

        double EOQ = calculateEOQ(demandRate, setupCosts, holdingCost);
        double TBO = calculateTBO(demandRate, setupCosts, holdingCost);

        System.out.println("Economic Order Quantity (EOQ): " + EOQ);
        System.out.println("Time Between Orders (TBO): " + TBO);

        scanner.close();
    }

    private static double calculateEOQ(double demandRate, double setupCosts, double holdingCost) {
        return Math.sqrt((2 * demandRate * setupCosts) / holdingCost);
    }

    private static double calculateTBO(double demandRate, double setupCosts, double holdingCost) {
        return Math.sqrt((2 * setupCosts) / (demandRate * holdingCost));
    }
}
