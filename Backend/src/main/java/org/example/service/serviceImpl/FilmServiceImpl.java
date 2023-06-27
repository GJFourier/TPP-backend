package org.example.service.serviceImpl;

import org.example.dao.FilmDao;
import org.example.service.FilmService;
import org.example.entity.Film;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    private final FilmDao filmDao;

    public FilmServiceImpl(FilmDao filmDao) {
        this.filmDao = filmDao;
    }

    @Override
    public List<Film> getAllFilms() {
        return filmDao.getAllFilms();
    }

    @Override
    public Film getFilmById(Long id) {
        return filmDao.getFilmById(id);
    }

    @Override
    public List<Film> getLaterFilms() {
        return filmDao.getLaterFilms();
    }

    @Override
    public List<Film> getIsOnFilms() {
        return filmDao.getIsOnFilms();
    }

    @Override
    public List<Film> getIsOnFilmsByCinema(Long cinemaId) {
        return filmDao.getIsOnFilmsByCinema(cinemaId);
    }

    @Override
    public List<Film> getLaterFilmsByCinema(Long cinemaId) {
        return filmDao.getLaterFilmsByCinema(cinemaId);
    }
}
