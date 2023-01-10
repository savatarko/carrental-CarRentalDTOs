package org.komponente.dto.carrental;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.komponente.dto.company.CompanyDto;
import org.komponente.dto.vehicle.VehicleDto;

@Setter
@Getter
public class CompanyCarCreateDto {
    private Long companyid;
    private Long vehicleid;
    private Long price;
    private Integer numberofcars;
}
