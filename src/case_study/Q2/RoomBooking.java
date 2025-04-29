package case_study.Q2;

public class RoomBooking extends HotelService{
    public RoomBooking(String guestId, String guestName, String roomType, int statusDays, String roomStatus){
        super(guestId, guestName, roomType, statusDays, roomStatus);

    }

    @Override
    public void bookRoom() {
       if (stayDays < 1 || stayDays > 30){
           System.out.println("Booking failed: Stay duration must be between 1 and 30.");

       }else if (!roomStatus.equals("AVAILABLE")){
           System.out.println("Booking failed: Room is currently not available.");

       }else{
           roomStatus = "OCCUPIED";
           System.out.println("Booking confirmed for " + guestName + "." +
                   "Room is now OCCUPIED.");
       }
    }


    @Override
    public void checkoutGuest() {}

    @Override
    public void generateBill() {}
}
