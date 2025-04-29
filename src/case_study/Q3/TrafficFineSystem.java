package case_study.Q3;

import java.util.Scanner;

public class TrafficFineSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Driver ID (16 digits): ");
        String id = sc.nextLine();
        if (id.length() != 16) {
            System.out.println("Invalid National ID.");
            return;
        }

        System.out.print("Enter Driver Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Vehicle Plate (e.g., RAB123D): ");
        String plate = sc.nextLine();

        System.out.print("Enter Violation Type (SPEEDING, RED_LIGHT, NO_HELMET, DUI): ");
        String type = sc.nextLine();

        // Step 1: Record Violation
        ViolationEntry violation = new ViolationEntry(id, name, plate, type);
        violation.recordViolation();

        // Step 2: Assess Fine
        FineAssessment assess = new FineAssessment(id, name, plate, type);
        assess.assessFine();

        // Step 3: Process Payment
        FinePayment payment = new FinePayment(id, name, plate, type, assess.fineAmount, violation.paymentStatus);
        payment.processPayment();

        sc.close();
    }
}
