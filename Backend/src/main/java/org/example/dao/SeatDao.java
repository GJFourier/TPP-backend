package org.example.dao;

import org.example.entity.Seat;

import java.util.List;

public interface SeatDao {
    Seat getSeatById(Long id);
    void setSeatStatusById(Long id, Boolean status);

    void save(Seat seat);
}
