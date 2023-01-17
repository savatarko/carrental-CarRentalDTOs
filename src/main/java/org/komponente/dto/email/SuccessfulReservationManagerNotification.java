package org.komponente.dto.email;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SuccessfulReservationManagerNotification {
    private String email;
    private String Vehiclename;
    private String companyname;
    private String startdate;
    private String enddate;

    @Override
    public String toString() {
        return "Hello manager!\n\n This is a email informing you that a reservation for " + Vehiclename +
                " from " + startdate + " to " + enddate + " has been made!\n\n Best regards,\n\n RAF car service";
    }
}
