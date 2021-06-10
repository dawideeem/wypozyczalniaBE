package projekt.psk.wypozyczalnia.carModule.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    @Id
    private String id;

    @NotBlank
    @Size(max = 20)
    private String name;

    @NotBlank
    @Size(max = 30)
    private String city;

    @NotBlank
    @Size(max = 30)
    private String gearbox;

    @NotBlank
    @Size(max = 30)
    private String doors;

    @NotBlank
    @Size(max = 30)
    private String fuel;

    @NotBlank
    @Size(max = 30)
    private String people;

    @NotBlank
    @Size(max = 30)
    private String condition;

    @NotBlank
    @Size(max = 120)
    private String imageUrl;

    @NotBlank
    @Size(max = 10)
    private String price;


    private String ownerId;
}
