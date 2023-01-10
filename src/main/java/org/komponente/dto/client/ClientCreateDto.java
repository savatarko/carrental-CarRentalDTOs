package org.komponente.dto.client;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
public class ClientCreateDto {
    private String name;
    private String surname;
    private String number;
    private LocalDate dateofbirth;
    private String passport;
    private String username;
    private LoginInfo loginInfo;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class LoginInfo{
        private String email;
        private String password;
    }
}
