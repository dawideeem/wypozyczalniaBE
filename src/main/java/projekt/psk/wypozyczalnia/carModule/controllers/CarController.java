package projekt.psk.wypozyczalnia.carModule.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projekt.psk.wypozyczalnia.carModule.models.Car;
import projekt.psk.wypozyczalnia.carModule.services.CarService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/car")
public class CarController {

    @Autowired
    CarService carService;

    @PostMapping("/add")
    public String saveCar(@RequestBody Car car) {
        return this.carService.saveCar(car);
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<?> updateCar(@PathVariable(value="id", required=true) String id, @RequestBody Car car){
        this.carService.updateCar(car, id);
        return ResponseEntity.ok("Zaktualizowano pomyślnie");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCar(@PathVariable(value="id", required=true) String id){
        this.carService.deleteCar(id);
        return ResponseEntity.ok("Pizza została usunięta");
    }

    @GetMapping("/get/{id}")
    public Optional<Car> getCar(@PathVariable(value="id", required=true) String id){
        return this.carService.getCar(id);
    }

    @GetMapping("/get")
    public List<Car> getAllCars() {
        return this.carService.getAllCars();
    }

    @GetMapping("/get-owned/{id}")
    public List<Car> getAllOwnedCars(@PathVariable(value="id", required=true) String id) {
        return this.carService.getAllOwnedCars(id);
    }


}
