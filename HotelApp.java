public class HotelApp {
    public static void main(String[] args) {
        HotelService valet = new Valet();
        HotelService houseKeeping = new HouseKeeping();
        HotelService cart = new Cart();
        
        FrontDesk facade = new FrontDesk(valet, houseKeeping, cart);

        facade.requestValetService("LOVE143");
        facade.requestHouseKeepingService(31);
        facade.requestCartService(9);
    }
}