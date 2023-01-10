package org.komponente.dto.rank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RankDto {
    private Long id;
    private String name;
    private Integer numberofdays;
    private Long value;
}