package ticket.booking.entites;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Train {
    private String trainId;
    private String trainNo;
    private List<List<Integer>> seats;
    private Map<String, String> stationTimings;
    private List<String> stations;

    public Train(String trainNo, List<List<Integer>> seats, Map<String, String> stationTimings, List<String> stations) {
        this.trainId = UUID.randomUUID().toString();
        this.seats = seats;
        this.stationTimings = stationTimings;
        this.stations = stations;
    }

    public Map<String, String> getStationTimings(){
        return this.stationTimings;
    }

    public List<List<Integer>> getSeats(){
        return this.seats;
    }

    public List<String> getStations(){
        return this.stations;
    }

    public String getTrainInfo(){
        return String.format("Train Id: %s Train No: %s", trainId, trainNo);
    }
}
