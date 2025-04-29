package case_study.Q3;

class FinePayment extends TrafficRecord{

    public FinePayment(String driverId, String driverName, String vehiclePlate, String violationType, double fineAmount, String paymentStatus) {
        super(driverId, driverName, vehiclePlate, violationType);
        this.fineAmount = fineAmount;
        this.paymentStatus = paymentStatus;
    }


    @Override
    void processPayment() {
        if (paymentStatus.equals("PAID")) {
            System.out.println("Payment already completed.");
        } else {
            paymentStatus = "PAID";
            System.out.println("====== Payment Receipt ======");
            System.out.println("Driver: " + driverName + " (" + driverId + ")");
            System.out.println("Vehicle: " + vehiclePlate);
            System.out.println("Violation: " + violationType);
            System.out.println("Amount Paid: " + fineAmount + " RWF");
            System.out.println("Status: " + paymentStatus);
        }
        
    }

    @Override
    void recordViolation() {}

    @Override
    void assessFine() {}
}
