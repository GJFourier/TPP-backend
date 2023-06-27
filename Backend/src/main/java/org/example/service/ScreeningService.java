package org.example.service;

import org.example.dto.ScreeningDTO;
import org.example.entity.Screening;

import java.util.List;

public interface ScreeningService {
    ScreeningDTO getScreening(Long screeningId);

    List<ScreeningDTO> getScreeningByCinemaAndFilm(Long cinemaId, Long filmId);
}
