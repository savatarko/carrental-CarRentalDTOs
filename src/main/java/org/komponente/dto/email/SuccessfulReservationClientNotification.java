package org.komponente.dto.email;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SuccessfulReservationClientNotification {
    private String email;
    private String username;
    private String companyname;
    private String Vehiclename;
    private Long totalprice;
    private String startdate;
    private String enddate;

    @Override
    public String toString() {
        return "Hello " + username + "!\n\n This is a email informing you that your reservation for " + Vehiclename +
                " from " + startdate + " to " + enddate + " has been successfully made!\n\n Total price: " + totalprice + " RSD\n\n Best regards,\n\n " + companyname;
    }
}
