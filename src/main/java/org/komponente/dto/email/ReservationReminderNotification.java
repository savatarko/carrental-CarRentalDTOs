package org.komponente.dto.email;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ReservationReminderNotification implements Serializable {
    private String email;
    private String username;
    private String Vehiclename;
    private String companyname;
    private String startdate;
    private String enddate;

    @Override
    public String toString() {
        return "Hello " + username + "!\n\n This is a email reminding you that you have a reservation for " + Vehiclename +
                " from " + startdate + " to " + enddate + " in 3 days!\n\n Best regards,\n\n" + companyname;
    }
}
