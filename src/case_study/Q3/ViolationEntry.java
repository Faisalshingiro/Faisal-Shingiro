package case_study.Q3;

class ViolationEntry extends TrafficRecord{
    public ViolationEntry(String driverId, String driverName, String vehiclePlate, String violationType) {
        super(driverId, driverName, vehiclePlate, violationType);

    }

    @Override
    void recordViolation() {
            if (violationType.equalsIgnoreCase("SPEEDING") ||
                    violationType.equalsIgnoreCase("RED_LIGHT") ||
                    violationType.equalsIgnoreCase("NO_HELMET") ||
                    violationType.equalsIgnoreCase("DUI")) {
                System.out.println("Violation recorded for " + driverName);
                System.out.println("Violation: " + violationType);
                System.out.println("Payment status: " + paymentStatus);
            } else {
                System.out.println("Invalid violation type.");
        }

    }

    @Override
    void assessFine() {}

    @Override
    void processPayment() {}
}
