package org.komponente.dto.client;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
public class ClientDto {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String number;
    private LocalDate dateofbirth;
    private Integer daysrented;
    private String username;

}
