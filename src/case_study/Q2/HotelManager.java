package case_study.Q2;
import java.util.Scanner;
public class HotelManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input

        System.out.print("Enter Guest ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Guest Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Room Type (STANDARD/DELUXE/SUITE): ");
        String type = scanner.nextLine();

        System.out.print("Enter Days of Stay: ");
        int days = scanner.nextInt();
        scanner.nextLine(); // flush

        String roomStatus = "AVAILABLE";  // Starting state

        //Room Booking

        RoomBooking booking = new RoomBooking(id, name, type, days, roomStatus);
        booking.bookRoom();
        roomStatus = booking.roomStatus;  // <- we have to  update room status
        String updatedRoomType = booking.roomType;

        // Guest checkout

        GuestCheckout checkout = new GuestCheckout(id, name, updatedRoomType, days, roomStatus);
        checkout.checkoutGuest();
        roomStatus = checkout.roomStatus; // <- I updated again

        // Billing

        Billing bill = new Billing(id, name, updatedRoomType, days, roomStatus); // <- I used updatedRoomType
        bill.generateBill();

        scanner.close();
    }
}