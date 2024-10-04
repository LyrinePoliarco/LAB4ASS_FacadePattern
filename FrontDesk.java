public class FrontDesk {
    private HotelService hotelService1;
    private HotelService hotelService2;
    private HotelService hotelService3;

    public FrontDesk(HotelService hotelService1, HotelService hotelService2, HotelService hotelService3) {
        this.hotelService1 = hotelService1;
        this.hotelService2 = hotelService2;
        this.hotelService3 = hotelService3;
    }

    public void requestValetService(String plateNumber) {
        hotelService1.pickUpVehicle(plateNumber);
    }

    public void requestHouseKeepingService(int roomNumber) {
        hotelService2.cleanRoom(roomNumber);
    }

    public void requestCartService(int numberOfCarts) {
        hotelService3.requestCart(numberOfCarts);
    }
}