package org.komponente.dto.manager;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.komponente.dto.client.ClientCreateDto;

import java.lang.ref.PhantomReference;
import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
public class ManagerCreateDto {

    private String name;
    private String surname;
    private String number;
    private LocalDate dateofbirth;
    private LocalDate dateofemployment;
    private String username;
    private Long companyId;

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
