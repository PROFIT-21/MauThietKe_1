package TheFacadePattern;

public class VacationFacade {
    private CarRental carRental;
    private HotelBooking hotelBooking;
    private FlightBooking flightBooking;

    public VacationFacade() {
        this.carRental = new CarRental();
        this.hotelBooking = new HotelBooking();
        this.flightBooking = new FlightBooking();
    }

    public void bookFullVacation(String destination) {
        System.out.println("--- Starting Vacation Booking for " + destination + " ---");
        flightBooking.bookFlight(destination);
        hotelBooking.bookRoom(destination);
        carRental.rentCar(destination);
        System.out.println("--- Vacation Successfully Booked! ---");
    }
}
