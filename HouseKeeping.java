public class HouseKeeping implements HotelService {
   
    public void cleanRoom(int roomNumber) {
        System.out.println("Cleaning room #" + roomNumber);
    }

  
    public void pickUpVehicle(String plateNumber) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    public void requestCart(int numberOfCarts) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}