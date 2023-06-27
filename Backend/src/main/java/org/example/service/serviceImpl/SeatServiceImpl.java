package org.example.service.serviceImpl;

import org.example.dao.ScreeningDao;
import org.example.entity.Screening;
import org.example.entity.Seat;
import org.example.service.SeatService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatServiceImpl implements SeatService {
    private final ScreeningDao screeningDao;

    public SeatServiceImpl(ScreeningDao screeningDao) {
        this.screeningDao = screeningDao;
    }

    @Override
    public List<Seat> getSeat(Long screeningId) {
        Screening screening = screeningDao.getScreeningById(screeningId);
        return screening.getSeats();
    }
}
