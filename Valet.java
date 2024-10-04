public class Valet implements HotelService {
   
    public void pickUpVehicle(String plateNumber) {
        System.out.println("Picked up vehicle: " + plateNumber);
    }

    
    public void cleanRoom(int roomNumber) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void requestCart(int numberOfCarts) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}