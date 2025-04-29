package case_study.Q2;

class Billing extends HotelService {

    public Billing(String guestId, String guestName, String roomType, int stayDays, String roomStatus) {
        super(guestId, guestName, roomType, stayDays, roomStatus);
    }

@Override
    public void generateBill() {
        int costPerNight = 0;
        switch (roomType) {
            case "STANDARD": costPerNight = 50000; break;
            case "DELUXE":   costPerNight = 80000; break;
            case "SUITE":    costPerNight = 120000; break;
            default:
                System.out.println("Invalid room type.");
                return;
        }

        int total = costPerNight * stayDays;

        System.out.println("------ Billing Details ------");
        System.out.println("Guest Name: " + guestName);
        System.out.println("Guest ID: " + guestId);
        System.out.println("Room Type: " + roomType);
        System.out.println("Days Stayed: " + stayDays);
        System.out.printf("Total Cost: RWF%,d\n", total);
    }


@Override
    public void bookRoom() {}
    @Override
    public void checkoutGuest() {}
}
