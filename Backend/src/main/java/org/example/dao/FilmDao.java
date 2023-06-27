package org.example.dao;

import org.example.entity.Film;

import java.util.List;

public interface FilmDao {

    List<Film> getAllFilms();

    Film getFilmById(Long id);

    List<Film> getLaterFilms();

    List<Film> getIsOnFilms();

    List<Film> getIsOnFilmsByCinema(Long cinemaId);

    List<Film> getLaterFilmsByCinema(Long cinemaId);
}
