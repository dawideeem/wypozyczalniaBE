package projekt.psk.wypozyczalnia.loginModule.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import projekt.psk.wypozyczalnia.loginModule.models.ERole;
import projekt.psk.wypozyczalnia.loginModule.models.Role;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}