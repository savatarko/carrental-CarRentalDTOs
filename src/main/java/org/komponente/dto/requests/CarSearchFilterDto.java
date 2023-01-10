package org.komponente.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class CarSearchFilterDto {
    //private String city;
    private String companyname;
    private Dateparam dateparam;
    private Integer sorted; // 0->not sorted, 1->sorted asc, -1 ->sorted desc

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Dateparam{
        private LocalDate startdate;
        private Integer duration;

    }
}
