package case_study.Q3;

class FineAssessment extends TrafficRecord{
    public FineAssessment(String driverId, String driverName, String vehiclePlate, String violationType) {
        super(driverId, driverName, vehiclePlate, violationType);
    }

    @Override
    void assessFine() {
        switch (violationType.toUpperCase()) {
            case "SPEEDING":
                fineAmount = 50000;
                break;
            case "RED_LIGHT":
                fineAmount = 80000;
                break;
            case "NO_HELMET":
                fineAmount = 30000;
                break;
            case "DUI":
                fineAmount = 150000;
                break;
            default:
                System.out.println("Unknown violation type.");
                return;
        }

        System.out.println("Fine for " + driverName + " (" + violationType + "): " + fineAmount + " RWF");

    }

    @Override
    void recordViolation() {}



    @Override
    void processPayment() {}
}
