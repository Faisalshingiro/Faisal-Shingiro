package case_study.Q2;

public class GuestCheckout extends HotelService{
    public GuestCheckout(String guestId, String guestName, String roomType, int stayDays, String roomStatus){
       super(guestId, guestName, roomType, stayDays, roomStatus);

    }

    @Override
    public void checkoutGuest() {
     if (!roomStatus.equals("OCCUPIED")){
         System.out.println("Checkout failed: Room is already available.");

     }else {
         roomStatus = "AVAILABLE";
         System.out.println("Checkout successful. Room is now AVAILABLE.");

     }
    }

    @Override
    public void bookRoom() {}



    @Override
    public void generateBill() {}
}
