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
        Optional<Car> pizza = this.carRepository.findById(id);
        pizza.ifPresent(piz -> {
            if(newCar.getName() != null){
                piz.setName(newCar.getName());
            }
            if(newCar.getCity() != null){
                piz.setCity(newCar.getCity());
            }
            if(newCar.getGearbox() != null){
                piz.setGearbox(newCar.getGearbox());
            }
            if(newCar.getDoors() != null){
                piz.setDoors(newCar.getDoors());
            }
            if(newCar.getFuel() != null){
                piz.setFuel(newCar.getFuel());
            }
            if(newCar.getPeople() != null){
                piz.setPeople(newCar.getPeople());
            }
            if(newCar.getCondition() != null){
                piz.setCondition(newCar.getCondition());
            }
            if(newCar.getPrice() != null){
                piz.setPrice(newCar.getPrice());
            }
            if(newCar.getImageUrl() != null){
                piz.setImageUrl(newCar.getImageUrl());
            }
            this.carRepository.save(piz);
        });
    }

    public List<Car> getAllCars(){
        return this.carRepository.findAll();
    }

    public List<Car> getAllOwnedCars(String id){
        return this.carRepository.findByOwnerId(id);
    }





    public Optional<Car> getCar(String id){
        return this.carRepository.findById(id);
    }




    }


