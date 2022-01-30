package projekt.psk.wypozyczalnia.rentModule.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rent {
    @Id
    private String id;

    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

    @Size(max = 20)
    private String firstname;

    @Size(max = 30)
    private String lastname;

    @Size(max = 12)
    private String phone;

    @Size(max = 20)
    private String city;

    @Size(max = 20)
    private String street;

    @Size(max = 20)
    private String build;

    @Size(max = 20)
    private String birth;

    @Size(max = 20)
    private String postal;

    @Size(max = 30)
    private String car;

    @Size(max = 30)
    private Date startDate;

    @Size(max = 30)
    private Date endDate;

    @Size(max = 30)
    private String price;

    @Size(max = 30)
    private String cityRent;

    @Size(max = 30)
    private String carRent;

    private boolean rented;

    private String ownerID;


    public boolean getRented() {
        return rented;
    }
}
