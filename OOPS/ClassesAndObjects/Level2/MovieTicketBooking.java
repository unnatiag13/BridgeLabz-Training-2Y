package OOPS.ClassesAndObjects.Level2;

class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    void bookTicket(String seat, double newPrice) {
        this.seatNumber = seat;
        this.price = newPrice;
        System.out.println("Ticket booked successfully!");
    }

    void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: " + price);
    }
}

public class MovieTicketBooking {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Inception", "A1", 250);
        ticket.displayTicket();
        ticket.bookTicket("B5", 300);
        ticket.displayTicket();
    }
}

