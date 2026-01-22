package ticket.booking.services;

import ticket.booking.entites.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserBookingService {
    private User user;

    private List<User> users;

    public UserBookingService(User user)  {
        this.users = new ArrayList<>();
        this.user = user;
    }

    public UserBookingService(){
        this.users = new ArrayList<>();
    }


    public void login(String name, String password){
        Optional<User> userFound = users.stream().filter(user -> user.getName().equals(name) && user.getPassword().equals(password)).findFirst();
        if(userFound.isPresent()){
            System.out.println("Successfully Logged In");
        }else{
            System.out.println("Invalid Credentials");
        }
    }


    public void signUp(User user){
        users.add(user);
        System.out.println("Sign up successful");
    }

    public void fetchBookings(){
        if(this.user != null) {
            user.printTickets();
        }
    }
}
