package org.example.dao.daoImpl;

import org.example.dao.SeatDao;
import org.example.entity.Seat;
import org.example.repository.SeatRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SeatDaoImpl implements SeatDao {
    private final SeatRepository seatRepository;

    public SeatDaoImpl(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }

    @Override
    public Seat getSeatById(Long id) {
        return seatRepository.getSeatById(id);
    }

    @Override
    public void setSeatStatusById(Long id, Boolean status) {
        Seat seat = seatRepository.getSeatById(id);
        seat.setIsSold(status);
        seatRepository.save(seat);
    }

    @Override
    public void save(Seat seat) {
        seatRepository.save(seat);
    }
}
