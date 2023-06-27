package org.example.controller;

import jakarta.transaction.Transactional;
import org.example.dao.ScreeningDao;
import org.example.dto.ScreeningDTO;
import org.example.entity.Screening;
import org.example.service.ScreeningService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
public class ScreeningController {
    private final org.example.service.ScreeningService screeningService;

    public ScreeningController(ScreeningService screeningService) {
        this.screeningService = screeningService;
    }

    @RequestMapping(value = "/api/screening/get",method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:3000")
    public ScreeningDTO getScreening(@RequestParam("screeningId") Long screeningId){
        return screeningService.getScreening(screeningId);
    }

    @RequestMapping(value = "/api/screening/getByCinemaAndFilm",method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:3000")
    public List<ScreeningDTO> getScreeningByCinemaAndFilm(@RequestParam("cinemaId") Long cinemaId, @RequestParam("filmId") Long filmId){
        return screeningService.getScreeningByCinemaAndFilm(cinemaId, filmId);
    }
}
