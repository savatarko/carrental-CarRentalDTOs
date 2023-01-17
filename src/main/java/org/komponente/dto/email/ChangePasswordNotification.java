package org.komponente.dto.email;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChangePasswordNotification {
    private String email;
    private String username;
    private String link;

    @Override
    public String toString() {
        return "Hello " + username + "!\n\n Please click on the link below to change your password: " + link;
    }
}
