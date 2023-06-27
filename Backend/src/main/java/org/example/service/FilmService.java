package org.example.service;

import org.example.entity.Film;

import java.util.List;

public interface FilmService {

    List<Film> getAllFilms();

    Film getFilmById(Long id);

    List<Film> getLaterFilms();

    List<Film> getIsOnFilms();

    List<Film> getIsOnFilmsByCinema(Long cinemaId);

    List<Film> getLaterFilmsByCinema(Long cinemaId);
}
