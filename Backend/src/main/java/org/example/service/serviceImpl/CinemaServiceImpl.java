package org.example.service.serviceImpl;
import org.example.dao.CinemaDao;
import org.example.entity.Cinema;
import org.example.service.CinemaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaServiceImpl implements CinemaService {
    CinemaDao cinemaDao;
    public CinemaServiceImpl(CinemaDao cinemaDao){this.cinemaDao = cinemaDao;}
    @Override
    public List<Cinema> getAllCinemas() {
        return cinemaDao.getAllCinemas();
    }

    @Override
    public Cinema getCinemaById(Long id) {
        return cinemaDao.getCinemaById(id);
    }

    @Override
    public List<Cinema> getCinemasByFilm(Long filmId) {
        return cinemaDao.getCinemasByFilm(filmId);
    }
}
