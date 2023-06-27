package org.example.service;

import org.example.entity.Seat;

import java.util.List;

public interface SeatService {
    List<Seat> getSeat(Long screeningId);
}
