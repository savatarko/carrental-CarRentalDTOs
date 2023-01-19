package org.komponente.dto.email;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class CancelReservationClientNotification implements Serializable {
    private String email;
    private String username;
    private String Vehiclename;
    private String companyname;
    private String startdate;
    private String enddate;
    private Long receiverId;

    @Override
    public String toString() {
        return "Hello " + username + "!\n\n This is a email informing you that your reservation for " + Vehiclename +
                " from " + startdate + " to " + enddate + " has been canceled!\n\n Best regards,\n\n" + companyname;
    }
}
