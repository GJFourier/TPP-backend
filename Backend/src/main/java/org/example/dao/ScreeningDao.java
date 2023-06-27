package org.example.dao;

import org.example.dto.ScreeningDTO;
import org.example.entity.Screening;

import java.util.List;

public interface ScreeningDao {
    Screening getScreeningById(Long screeningId);

    ScreeningDTO getScreeningDTOById(Long screeningId);

    List<ScreeningDTO> getScreeningDTOByCinemaAndFilm(Long cinemaId, Long filmId);
}
