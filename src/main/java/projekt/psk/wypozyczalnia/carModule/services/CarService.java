package projekt.psk.wypozyczalnia.carModule.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projekt.psk.wypozyczalnia.carModule.models.Car;
import projekt.psk.wypozyczalnia.carModule.repositories.CarRepository;

import java.util.*;

@Service
public class CarService {
    @Autowired
    CarRepository carRepository;

    public String saveCar(Car car){
        return this.carRepository.save(car).getId();
    }
    public void deleteCar(String id){
        this.carRepository.deleteById(id);
    }

    public void updateCar(Car newCar, String id){
        Optional<Car> cars = this.carRepository.findById(id);
        cars.ifPresent(car -> {
            if(newCar.getName() != null){
                car.setName(newCar.getName());
            }
            if(newCar.getCity() != null){
                car.setCity(newCar.getCity());
            }
            if(newCar.getGearbox() != null){
                car.setGearbox(newCar.getGearbox());
            }
            if(newCar.getDoors() != null){
                car.setDoors(newCar.getDoors());
            }
            if(newCar.getFuel() != null){
                car.setFuel(newCar.getFuel());
            }
            if(newCar.getPeople() != null){
                car.setPeople(newCar.getPeople());
            }
            if(newCar.getCondition() != null){
                car.setCondition(newCar.getCondition());
            }
            if(newCar.getPrice() != null){
                car.setPrice(newCar.getPrice());
            }
            if(newCar.getImageUrl() != null){
                car.setImageUrl(newCar.getImageUrl());
            }
            this.carRepository.save(car);
        });
    }

    public List<Car> getAllCars(){
        return this.carRepository.findAll();
    }

    public Optional<Car> getCar(String id){
        return this.carRepository.findById(id);
    }
}


