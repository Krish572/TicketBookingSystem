package ticket.booking.services;

import ticket.booking.entites.Train;

import java.util.ArrayList;
import java.util.List;

public class TrainService
{
    private List<Train> trains;

    public TrainService(){
        this.trains = new ArrayList<>();
    }

    public void addTrain(Train train){
        this.trains.add(train);
    }

    public void searchTrains(String source, String destination){
        List<Train> trainsFound = fetchTrains(source, destination);
        for(Train train : trainsFound){
            System.out.println(train.getTrainInfo());
        }
    }

    private List<Train> fetchTrains(String source, String destination){
        List<Train> trainsFound = new ArrayList<>();
        for(Train train : this.trains){
            if(train.getStations().contains(source) && train.getStations().contains(destination) && train.getStations().indexOf(source) < train.getStations().indexOf(destination)) {
                trainsFound.add(train);
            }
        }
        return trainsFound;
    }

    public void bookSeats(String source, String destination, String trainId){
        List<Train> trainsFound = fetchTrains(source, destination);
        Train trainFound = null;
        for(Train train : trainsFound) {
            if (train.getTrainId().equals(trainId)) {
                trainFound = train;
            }
        }
        if(trainFound == null){
            System.out.println("Train not found");
        }
        if(trainFound.getSeatsAvailable() > 0){
            for(int i = 0; i < trainFound.getSeats().size(); i++){
                for(int j = 0; j < trainFound.getSeats().get(i).size(); j++){
                    if(trainFound.getSeats().get(i).get(j) == 0){
                        trainFound.getSeats().get(i).set(j, 1);
                        System.out.println("Booked Successfully");
                        break;
                    }
                }
            }
        }else {
            System.out.println("Seats are full");
        }
    }
}
