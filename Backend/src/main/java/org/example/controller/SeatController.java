package org.example.controller;
import jakarta.transaction.Transactional;
import org.example.entity.Seat;
import org.example.service.SeatService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
public class SeatController {
    private final SeatService seatService;

    public SeatController(SeatService seatService) {
        this.seatService = seatService;
    }

    @RequestMapping(value = "/api/seat/get",method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Seat> getSeat(@RequestParam("screeningId") Long screeningId){
        return seatService.getSeat(screeningId);
    }
}
