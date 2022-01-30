package projekt.psk.wypozyczalnia.userModule.models;


import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import projekt.psk.wypozyczalnia.loginModule.models.Role;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users")
public class User {
    @Id
    private String id;

    private boolean isActive;

    @NotBlank
    @Size(max = 20)
    private String username;

    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

    @NotBlank
    @Size(max = 120)
    private String password;

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

    @DBRef
    private Set<Role> roles = new HashSet<>();



    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;

    }

    public void activate(){
        this.isActive = true;
    }

    public void deactivate(){
        this.isActive = false;
    }

}