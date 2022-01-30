package projekt.psk.wypozyczalnia.carModule.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import projekt.psk.wypozyczalnia.carModule.models.Car;
import java.util.Optional;

public interface CarRepository extends MongoRepository<Car, String> {
        Optional<Car> findById(String id);
        }
