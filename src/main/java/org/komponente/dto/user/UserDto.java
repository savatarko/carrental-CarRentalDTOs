package org.komponente.dto.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private Long id;
    private String username;
    private String email;
    private String name;
    private String surname;
    private Boolean hasaccess;

}
