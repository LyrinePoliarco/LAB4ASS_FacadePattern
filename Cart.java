public class Cart implements HotelService {
 
    public void requestCart(int numberOfCarts) {
        System.out.println(numberOfCarts + " luggage cart requested");
    }
    
    
    public void cleanRoom(int roomNumber) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

   
    public void pickUpVehicle(String plateNumber) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}