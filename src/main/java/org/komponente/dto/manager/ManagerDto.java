package org.komponente.dto.manager;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
public class ManagerDto {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String number;
    private LocalDate dateofbirth;
    private LocalDate dateofemployment;
    private Long companyId;
    private String username;
}
