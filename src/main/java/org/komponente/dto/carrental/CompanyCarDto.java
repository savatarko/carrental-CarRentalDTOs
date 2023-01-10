package org.komponente.dto.carrental;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.komponente.dto.company.CompanyDto;
import org.komponente.dto.vehicle.VehicleDto;

@Getter
@Setter
public class CompanyCarDto {
    private Long id;
    //private Long companyid;
    @JsonProperty("company")
    private CompanyDto companyDto;
    //private Long vehicleid;
    @JsonProperty("vehicle")
    private VehicleDto vehicleDto;
    private Long price;
    private Integer numberofcars;
}
