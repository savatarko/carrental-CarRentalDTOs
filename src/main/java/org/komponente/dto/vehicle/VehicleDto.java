package org.komponente.dto.vehicle;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VehicleDto {
    private Long id;
    @JsonProperty("vehicletype")
    private VehicleTypeDto vehicleTypeDto;
    private String name;
}
