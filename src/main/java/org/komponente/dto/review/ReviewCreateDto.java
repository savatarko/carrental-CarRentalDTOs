package org.komponente.dto.review;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewCreateDto {
    private Long clientid;
    private Integer stars;
    private String description;

    private Long companyid;

}
