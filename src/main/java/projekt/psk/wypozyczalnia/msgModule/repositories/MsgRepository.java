package projekt.psk.wypozyczalnia.msgModule.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import projekt.psk.wypozyczalnia.msgModule.models.Msg;

import java.util.List;
import java.util.Optional;


public interface MsgRepository extends MongoRepository<Msg, String> {
        Optional<Msg> findById(String id);
        List<Msg> findByOwnerId(String id);
        }
