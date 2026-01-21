package ticket.booking.entites;

import java.util.List;
import java.util.UUID;

public class User {
    private String userId;
    private String name;
    private String password;
    private List<Ticket> ticketsBooked;

    public User(String name, String password) {
        this.userId = UUID.randomUUID().toString();
        this.name = name;
        this.password = password;
    }

    public String getName(){
        return this.name;
    }

    public String getPassword(){
        return this.password;
    }

    public List<Ticket> getTicketsBooked(){
        return this.ticketsBooked;
    }

    public String printTickets(){
        for (Ticket ticket : ticketsBooked) {
            System.out.println(ticket.getTicketInfo());
        }
    }

    public String getUserId() {
        return this.userId;
    }
}
