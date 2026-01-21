package ticket.booking.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ticket.booking.entites.User;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class UserBookingService {
    private User user;

    private List<User> users;

    private ObjectMapper objectMapper = new ObjectMapper();

    private static final String filePath = "app/src/main/java/ticket.booking/localDb/users.json";

    public UserBookingService(User user) throws IOException {
        this.user = user;
        File usersJson = new File(filePath);
        this.users = objectMapper.readValue(usersJson, new TypeReference<List<User>>() {});
    }

    public boolean login(String name, String password){
        Optional<User> userFound = this.users.stream().filter(user -> user.getName().equals(name) && user.getPassword().equals(password)).findFirst();
        return userFound.isPresent();
    }

    private void saveToDb() throws IOException{
        File usersJson = new File(filePath);
        objectMapper.writeValue(usersJson, users);
    }

    public Boolean signUp(User user){
        try{
            users.add(user);
            saveToDb();
            return Boolean.TRUE;
        }catch(IOException exception){
            return Boolean.FALSE;
        }
    }

    public void fetchBookings(){
        user.
    }
}
