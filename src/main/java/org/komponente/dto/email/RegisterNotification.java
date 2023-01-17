package org.komponente.dto.email;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class RegisterNotification implements Serializable {
    private String email;
    private String name;
    private String surname;
    private String link;


    @Override
    public String toString() {
        return "Welcome to RAF car rental, " + name + " " + surname + "!\n\n Please click on the link below to activate your account: " + link;

    }
}