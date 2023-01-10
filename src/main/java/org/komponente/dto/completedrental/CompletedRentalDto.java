package org.komponente.dto.completedrental;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.komponente.dto.carrental.CompanyCarDto;

import java.time.LocalDate;

@Getter
@Setter
public class CompletedRentalDto {
    private Long id;
    @JsonProperty("company")
    private CompanyCarDto companyCarDto;
    private Long clientId;
    private LocalDate begindate;
    private LocalDate enddate;
    private Long totalprice;
    private Integer stars;
    private String comment;
}