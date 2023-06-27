package org.example.service;

import org.example.entity.Cinema;

import java.util.List;

public interface CinemaService {
    List<Cinema> getAllCinemas();

    Cinema getCinemaById(Long id);

    List<Cinema> getCinemasByFilm(Long filmId);
}
