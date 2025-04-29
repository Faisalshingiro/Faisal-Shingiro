package case_study.Q1;

import java.util.Scanner;

public class SiteManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Contractor ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Contractor Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Material Quantity for Delivery: ");
        double quantity = scanner.nextDouble();

        MaterialDelivery delivery = new MaterialDelivery(id, name, quantity);
        delivery.receiveMaterial();

        double currentBalance = delivery.materialBalance;

        System.out.print("Enter Material Quantity for Usage: ");
        double usageQuantity = scanner.nextDouble();

        MaterialUsage usage = new MaterialUsage(id, name, usageQuantity, currentBalance);
        usage.useMaterial();

        System.out.print("Enter Quantity for Cost Estimation: ");
        double costQuantity = scanner.nextDouble();

        CostEstimation cost = new CostEstimation(id, name, costQuantity);
        cost.estimateCost();

        scanner.close();
    }
}
