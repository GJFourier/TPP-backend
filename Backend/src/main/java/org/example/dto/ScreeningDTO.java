package org.example.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ScreeningDTO {
    private Long id;
    private Date startTime;
    private Date endTime;
    private Double price;
    private Long filmId;
    private String filmTitle;
    private String filmImage;
    private Long cinemaId;
    private String cinemaName;
    private Long hallId;
    private String hallName;
}
