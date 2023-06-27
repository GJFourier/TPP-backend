package org.example.repository;

import org.example.entity.Screening;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScreeningRepository extends JpaRepository<Screening, Long> {
    Screening getScreeningById(Long screeningId);

    List<Screening> getScreeningByCinemaIdAndFilmId(Long cinemaId, Long filmId);
}
