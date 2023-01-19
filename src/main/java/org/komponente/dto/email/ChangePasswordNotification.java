package org.komponente.dto.email;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ChangePasswordNotification implements Serializable {
    private String email;
    private String username;
    private String link;
    private Long receiverId;

    @Override
    public String toString() {
        return "Hello " + username + "!\n\n Please click on the link below to change your password: " + link;
    }
}
