package org.example.controller;

import jakarta.transaction.Transactional;
import org.example.service.FilmService;
import org.example.entity.Film;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Transactional
public class FilmController {
    private final FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @RequestMapping(value = "/api/film/get", method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Film> getIsOnFilms() {
        return filmService.getIsOnFilms();
    }

    @RequestMapping(value = "/api/film/getLater", method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Film> getLaterFilms() {
        return filmService.getLaterFilms();
    }

    @RequestMapping(value = "/api/film/get/isOnByCinema",method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Film> getIsOnFilmsByCinema(@RequestParam("cinemaId") Long cinemaId){
        return filmService.getIsOnFilmsByCinema(cinemaId);
    }

    @RequestMapping(value = "/api/film/get/laterByCinema",method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Film> getLaterFilmsByCinema(@RequestParam("cinemaId") Long cinemaId){
        return filmService.getLaterFilmsByCinema(cinemaId);
    }

    @RequestMapping(value = "/api/film/getById/{id}",method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:3000")
    public Film getFilmById(@PathVariable Long id){return filmService.getFilmById(id);}
}
