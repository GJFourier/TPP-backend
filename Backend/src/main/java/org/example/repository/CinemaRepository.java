package org.example.repository;

import org.example.entity.Cinema;
import org.example.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CinemaRepository extends JpaRepository<Cinema, Long> {
    Cinema getCinemaById(Long id);
    List<Cinema> getCinemasByFilms_Id(Long id);
}
