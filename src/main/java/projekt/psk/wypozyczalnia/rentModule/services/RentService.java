package projekt.psk.wypozyczalnia.rentModule.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projekt.psk.wypozyczalnia.rentModule.models.Rent;
import projekt.psk.wypozyczalnia.rentModule.repositories.RentRepository;

import java.util.*;

@Service
public class RentService {
    @Autowired
    RentRepository rentRepository;


    public String saveRent(Rent rent){
        return this.rentRepository.save(rent).getId();
    }
    public void deleteRent(String id){
        this.rentRepository.deleteById(id);
    }

    public void updateRent(Rent newRent, String id){
        Optional<Rent> rent = this.rentRepository.findById(id);
        rent.ifPresent(ren -> {
//            if(newRent.getEmail() != null){
//                ren.setEmail(newRent.getEmail());
//            }
//            if(newRent.getCity() != null){
//                ren.setCity(newRent.getCity());
//            }
//            if(newRent.getFirstname() != null){
//                ren.setFirstname(newRent.getFirstname());
//            }
//            if(newRent.getLastname() != null){
//                ren.setLastname(newRent.getLastname());
//            }
//            if(newRent.getPhone() != null){
//                ren.setPhone(newRent.getPhone());
//            }
//            if(newRent.getCity() != null){
//                ren.setCity(newRent.getCity());
//            }
//            if(newRent.getStreet() != null) {
//                ren.setStreet(newRent.getStreet());
//            }
//            if(newRent.getBuild() != null) {
//                ren.setBuild(newRent.getBuild());
//            }
//            if(newRent.getPhone() != null) {
//                ren.setBirth(newRent.getBirth());
//            }
//            if(newRent.getEmail() != null) {
//                ren.setEmail(newRent.getEmail());
//            }
//            if(newRent.getPostal() != null) {
//                ren.setPostal(newRent.getPostal());
//            }
//            if(newRent.getCar() != null) {
//                ren.setCar(newRent.getCar());
//            }
//            if(newRent.getStartDate() != null) {
//                ren.setStartDate(newRent.getStartDate());
//            }
//            if(newRent.getEndDate() != null) {
//                ren.setEndDate(newRent.getEndDate());
//            }
//            if(newRent.getPrice() != null) {
//                ren.setPrice(newRent.getPrice());
//            }
//            if(newRent.getCityRent() != null) {
//                ren.setCityRent(newRent.getCityRent());
//            }
//            if(newRent.getCarRent() != null) {
//                ren.setCarRent(newRent.getCarRent());
//            }

                ren.setRented(newRent.getRented());


            this.rentRepository.save(ren);
        });
    }

    public List<Rent> getAllRents(){
        return this.rentRepository.findAll();
    }


    public Optional<Rent> getRent(String id){
        return this.rentRepository.findById(id);
    }

    public List<Rent> getAllOwnedRent(String id){
        return this.rentRepository.findByOwnerID(id);
    }
}


