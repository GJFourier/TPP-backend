package org.example.service.serviceImpl;

import org.example.dao.ScreeningDao;
import org.example.dto.ScreeningDTO;
import org.example.entity.Screening;
import org.example.service.ScreeningService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ScreeningServiceImpl implements ScreeningService {
    private final ScreeningDao screeningDao;

    public ScreeningServiceImpl(ScreeningDao screeningDao) {
        this.screeningDao = screeningDao;
    }

    @Override
    public ScreeningDTO getScreening(Long screeningId) {
        return screeningDao.getScreeningDTOById(screeningId);
    }

    @Override
    public List<ScreeningDTO> getScreeningByCinemaAndFilm(Long cinemaId, Long filmId) {
        return screeningDao.getScreeningDTOByCinemaAndFilm(cinemaId, filmId);
    }
}
