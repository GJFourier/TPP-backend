package org.example.controller;
import jakarta.transaction.Transactional;
import org.example.entity.Cinema;
import org.springframework.web.bind.annotation.*;
import org.example.service.CinemaService;
import org.example.service.CinemaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Transactional
public class CinemaController {
    private final CinemaService cinemaService;
    public CinemaController(CinemaService cinemaService) {
        this.cinemaService = cinemaService;
    }

    @RequestMapping(value = "/api/cinema/get", method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Cinema> getAllCinemas(){
        return cinemaService.getAllCinemas();
    }

    @RequestMapping(value = "/api/cinema/getById/{id}", method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:3000")
    public Cinema getCinemaById(@PathVariable Long id){return cinemaService.getCinemaById(id);}

    @RequestMapping(value = "/api/cinema/getByFilm", method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Cinema> getCinemasByFilm(@RequestParam("filmId") Long filmId){
        return cinemaService.getCinemasByFilm(filmId);
    }
}
