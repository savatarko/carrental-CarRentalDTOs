package org.komponente.dto.user;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ChangeUserDto {
    private String username;
    private String name;
    private String surname;
    private String number;
    private LocalDate dateofbirth;
    private String email;
    private String password;

    //Client part
    private String passport;
}
