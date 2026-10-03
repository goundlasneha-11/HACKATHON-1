import java.util.Scanner;

public class WasteCalculator {

    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter waste collected at point 1 (kg): ");
        double point1 = scanner.nextDouble();

        System.out.print("Enter waste collected at point 2 (kg): ");
        double point2 = scanner.nextDouble();

        double totalWaste = calculateTotalWaste(point1, point2);

        System.out.println("Total waste collected: " + totalWaste + " kg");

        scanner.close();
    }
}