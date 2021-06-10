package projekt.psk.wypozyczalnia.loginModule.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import projekt.psk.wypozyczalnia.userModule.models.User;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}