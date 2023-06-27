package org.example.dto;

import lombok.Getter;
import lombok.Setter;
import org.example.entity.Seat;

@Getter
@Setter
public class SeatDTO {
    private Long id;
    private String name;
    public SeatDTO(Seat seat){
        this.id=seat.getId();
        this.name=seat.getSeatRow().toString()+"排"+seat.getSeatColumn().toString()+"座";
    }
}
