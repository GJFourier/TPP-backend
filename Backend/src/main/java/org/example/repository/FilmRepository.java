package org.example.repository;

import org.example.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Long> {
    Film getFilmById(Long id);
    List<Film> getFilmsByCinemas_Id(Long id);
}
