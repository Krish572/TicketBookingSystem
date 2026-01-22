package ticket.booking.entites;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.UUID;


public class User {
    private String userId;
    private String name;
    private String password;
    private List<Ticket> ticketsBooked;

    public User(){}

    public User(String name, String password){
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

    public void printTickets(){
        if(this.ticketsBooked.isEmpty()){
            System.out.println("No tickets found");
        }
        for (Ticket ticket : ticketsBooked) {
            System.out.println(ticket.getTicketInfo());
        }
    }

    public String getUserId() {
        return this.userId;
    }
}
