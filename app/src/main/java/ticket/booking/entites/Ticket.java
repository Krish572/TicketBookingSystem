package ticket.booking.entites;

import java.util.UUID;

public class Ticket {
    private String ticketId;
    private String userId;
    private String source;
    private String destination;
    private String journeyDate;
    private Train train;

    public Ticket(String userId, String source, String destination, String journeyDate, Train train){
        this.ticketId = UUID.randomUUID().toString();
        this.userId = userId;
        this.source = source;
        this.destination = destination;
        this.journeyDate = journeyDate;
        this.train = train;
    }

    public String getTicketInfo(){
        return String.format("Ticket Id: %s, belongs to user: %s, from %s to %s on %s", ticketId, userId, source, destination, journeyDate);
    }
}
