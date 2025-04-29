package case_study.Q3;

abstract class TrafficRecord {
    protected String driverId;
    protected String driverName;
    protected String vehiclePlate;
    protected String violationType;
    protected double fineAmount;
    protected String paymentStatus;

    public TrafficRecord(String driverId, String driverName, String vehiclePlate, String violationType) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.vehiclePlate = vehiclePlate;
        this.violationType = violationType.toUpperCase();
        this.paymentStatus = "UNPAID";
    }

    abstract void recordViolation();
    abstract void assessFine();
    abstract void processPayment();
}
