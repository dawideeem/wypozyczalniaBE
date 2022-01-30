package projekt.psk.wypozyczalnia.userModule.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projekt.psk.wypozyczalnia.loginModule.repository.UserRepository;
import projekt.psk.wypozyczalnia.userModule.models.User;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public List<User> getAllUsers(){
        return this.userRepository.findAll();
    }

    public Optional<User> getUser(String id){
        return this.userRepository.findById(id);
    }

    public void updateUser(User newUser, String id){
        Optional<User> user = this.userRepository.findById(id);
        user.ifPresent(usr -> {
            if(newUser.getUsername() != null){
                usr.setUsername(newUser.getUsername());
            }
            if(newUser.getEmail() != null){
                usr.setEmail(newUser.getEmail());
            }
            this.userRepository.save(usr);
        });
    }

    public void updateUser2(User newUser, String id){
        Optional<User> user = this.userRepository.findById(id);
        user.ifPresent(usr -> {
            if(newUser.getFirstname() != null) {
                usr.setFirstname(newUser.getFirstname());
            }
            if(newUser.getLastname() != null) {
                usr.setLastname(newUser.getLastname());
            }
            if(newUser.getPhone() != null) {
                usr.setPhone(newUser.getPhone());
            }
            if(newUser.getCity() != null) {
                usr.setCity(newUser.getCity());
            }
            if(newUser.getStreet() != null) {
                usr.setStreet(newUser.getStreet());
            }
            if(newUser.getBuild() != null) {
                usr.setBuild(newUser.getBuild());
            }
            if(newUser.getPhone() != null) {
                usr.setBirth(newUser.getBirth());
            }
            if(newUser.getEmail() != null) {
                usr.setEmail(newUser.getEmail());
            }
            if(newUser.getPostal() != null) {
                usr.setPostal(newUser.getPostal());
            }
            this.userRepository.save(usr);
        });
    }

    public void deleteUser(String id){
        this.userRepository.deleteById(id);
    }

    public void updateUserWithoutId(User user){
        this.userRepository.save(user);
    }
}
