package org.example.dao.daoImpl;

import org.example.dao.FilmDao;
import org.example.repository.FilmRepository;
import org.example.entity.Film;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FilmDaoImpl implements FilmDao {

    private final FilmRepository filmRepository;

    public FilmDaoImpl(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    @Override
    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }

    @Override
    public Film getFilmById(Long id) {
        return filmRepository.getFilmById(id);
    }

    @Override
    public List<Film> getLaterFilms() {
        List<Film> films = filmRepository.findAll();
        films.removeIf(film -> !film.getIsLater());
        return films;
    }

    @Override
    public List<Film> getIsOnFilms() {
        List<Film> films = filmRepository.findAll();
        films.removeIf(Film::getIsLater);
        return films;
    }

    @Override
    public List<Film> getIsOnFilmsByCinema(Long cinemaId) {
        List<Film> filmsByCinema = filmRepository.getFilmsByCinemas_Id(cinemaId);
        filmsByCinema.removeIf(Film::getIsLater);
        return filmsByCinema;
    }

    @Override
    public List<Film> getLaterFilmsByCinema(Long cinemaId) {
        List<Film> filmsByCinema = filmRepository.getFilmsByCinemas_Id(cinemaId);
        filmsByCinema.removeIf(film -> !film.getIsLater());
        return filmsByCinema;
    }
}
