package org.example.dao.daoImpl;

import org.example.dao.ScreeningDao;
import org.example.dto.ScreeningDTO;
import org.example.entity.Screening;
import org.example.entity.Seat;
import org.example.repository.ScreeningRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ScreeningDaoImpl implements ScreeningDao {
    private final ScreeningRepository screeningRepository;

    public ScreeningDaoImpl(ScreeningRepository screeningRepository) {
        this.screeningRepository = screeningRepository;
    }
    @Override
    public Screening getScreeningById(Long screeningId) {
        return screeningRepository.getScreeningById(screeningId);
    }

    @Override
    public ScreeningDTO getScreeningDTOById(Long screeningId) {
        Screening screening = screeningRepository.getScreeningById(screeningId);
        ScreeningDTO screeningDTO = new ScreeningDTO();

        screeningDTO.setId(screening.getId());
        screeningDTO.setStartTime(screening.getStartTime());
        screeningDTO.setEndTime(screening.getEndTime());
        screeningDTO.setPrice(screening.getPrice());
        screeningDTO.setFilmId(screening.getFilm().getId());
        screeningDTO.setFilmTitle(screening.getFilm().getName());
        screeningDTO.setFilmImage(screening.getFilm().getImage());
        screeningDTO.setCinemaId(screening.getCinema().getId());
        screeningDTO.setCinemaName(screening.getCinema().getName());
        screeningDTO.setHallId(screening.getHall().getId());
        screeningDTO.setHallName(screening.getHall().getName());

        return screeningDTO;
    }

    @Override
    public List<ScreeningDTO> getScreeningDTOByCinemaAndFilm(Long cinemaId, Long filmId) {
        List<Screening> screenings = screeningRepository.getScreeningByCinemaIdAndFilmId(cinemaId, filmId);
        List<ScreeningDTO> screeningDTOS = new java.util.ArrayList<>(screenings.size());

        for (Screening screening : screenings) {
            ScreeningDTO screeningDTO = new ScreeningDTO();

            screeningDTO.setId(screening.getId());
            screeningDTO.setStartTime(screening.getStartTime());
            screeningDTO.setEndTime(screening.getEndTime());
            screeningDTO.setPrice(screening.getPrice());
            screeningDTO.setFilmId(screening.getFilm().getId());
            screeningDTO.setFilmTitle(screening.getFilm().getName());
            screeningDTO.setFilmImage(screening.getFilm().getImage());
            screeningDTO.setCinemaId(screening.getCinema().getId());
            screeningDTO.setCinemaName(screening.getCinema().getName());
            screeningDTO.setHallId(screening.getHall().getId());
            screeningDTO.setHallName(screening.getHall().getName());

            screeningDTOS.add(screeningDTO);
        }

        return screeningDTOS;
    }
}
