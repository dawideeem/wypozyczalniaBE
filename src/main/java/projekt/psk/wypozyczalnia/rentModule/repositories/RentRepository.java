package projekt.psk.wypozyczalnia.rentModule.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import projekt.psk.wypozyczalnia.rentModule.models.Rent;

import java.util.List;
import java.util.Optional;


public interface RentRepository extends MongoRepository<Rent, String> {
        Optional<Rent> findById(String id);
        List<Rent> findByOwnerID(String id);

        }
