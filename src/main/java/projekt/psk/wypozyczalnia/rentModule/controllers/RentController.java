package projekt.psk.wypozyczalnia.rentModule.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projekt.psk.wypozyczalnia.rentModule.models.Rent;
import projekt.psk.wypozyczalnia.rentModule.services.RentService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/rent")
public class RentController {

    @Autowired
    RentService rentService;

    @PostMapping("/add")
    public String saveCar(@RequestBody Rent rent) {
        return this.rentService.saveRent(rent);
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<?> updateCar(@PathVariable(value="id", required=true) String id, @RequestBody Rent rent){
        this.rentService.updateRent(rent, id);
        return ResponseEntity.ok("Zaktualizowano pomyślnie");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCar(@PathVariable(value="id", required=true) String id){
        this.rentService.deleteRent(id);
        return ResponseEntity.ok("Auto zostało usunięta");
    }

    @GetMapping("/get/{id}")
    public Optional<Rent> getRent(@PathVariable(value="id", required=true) String id){
        return this.rentService.getRent(id);
    }

    @GetMapping("/getOwner/{id}")
    public List<Rent> getAllOwnedRent(@PathVariable(value="id", required=true) String id){
        return this.rentService.getAllOwnedRent(id);
    }

    @GetMapping("/get")
    public List<Rent> getAllRents() {
        return this.rentService.getAllRents();
    }


}
