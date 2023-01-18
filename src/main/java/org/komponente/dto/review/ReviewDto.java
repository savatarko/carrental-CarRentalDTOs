package org.komponente.dto.review;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewDto {
    /*
    private Long id;
    private Long clientid;
    private Long companyid;
    private Integer stars;
    private String description;

     */
    private Long id;
    private Integer stars;
    private String comment;
}
