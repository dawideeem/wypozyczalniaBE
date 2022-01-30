package projekt.psk.wypozyczalnia.msgModule.models;

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
public class Msg {
    @Id
    private String id;

    @NotBlank
    @Size(min = 1)
    private String ownerId;

    @NotBlank
    @Size(max = 30)
    private String username;

    @NotBlank
    @Size(max = 30)
    private String email;

    @NotBlank
    @Size(max = 30)
    private String subject;

    @NotBlank
    private String userMessage[];

    @NotBlank
    private String adminMessage[];


    @NotBlank
    private Boolean option;


}
