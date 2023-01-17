package org.komponente.dto.reservation;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
public class ActiveReservationCreateDto {
    private Long companycarid;
    private LocalDate begindate;
    private LocalDate enddate;

    private Long totalprice;
}
