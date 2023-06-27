package org.example.dao.daoImpl;

import org.example.dao.CinemaDao;
import org.example.entity.Cinema;
import org.example.repository.CinemaRepository;
import org.example.repository.FilmRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CinemaDaoImpl implements CinemaDao {
    CinemaRepository cinemaRepository;

    public CinemaDaoImpl(CinemaRepository cinemaRepository) {
        this.cinemaRepository = cinemaRepository;
    }
    @Override
    public List<Cinema> getAllCinemas() {
        return cinemaRepository.findAll();
    }

    @Override
    public Cinema getCinemaById(Long id) {
        return cinemaRepository.getCinemaById(id);
    }

    @Override
    public List<Cinema> getCinemasByFilm(Long filmId) {
        return cinemaRepository.getCinemasByFilms_Id(filmId);
    }
}
