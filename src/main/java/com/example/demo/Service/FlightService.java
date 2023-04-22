package com.example.demo.Service;

import com.example.demo.controllers.DTO.FlightDTO;
import com.example.demo.entity.Flight;
import com.example.demo.entity.Ticket;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
public interface FlightService {
    Flight findByNumber(String number);
    Optional<Flight> findById(Long id);
    List<Flight> findByArrival(String arrival);
    List<Flight> findByDeparture(String departure);
    List<Flight> findByArrivalAndDeparture(String arrival, String departure);
    List<FlightDTO> findAll();
    void anulateFlight(Long id);
    Flight updateFlight(Flight flight, int nr_seats);
}
