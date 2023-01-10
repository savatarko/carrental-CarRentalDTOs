package org.komponente.dto.vehicle;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VehicleCreateDto {
    private Long vehicleTypeId;
    private String name;
}
