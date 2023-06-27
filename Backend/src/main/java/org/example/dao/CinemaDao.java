package org.example.dao;

import org.example.entity.Cinema;

import java.util.List;

public interface CinemaDao {
    List<Cinema> getAllCinemas();

    Cinema getCinemaById(Long id);

    List<Cinema> getCinemasByFilm(Long filmId);
}
