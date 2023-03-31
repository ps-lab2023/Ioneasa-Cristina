package com.example.demo.Service;

import com.example.demo.Repository.FlightRepository;
import com.example.demo.entity.Flight;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class FlightServiceImplementare implements FlightService{
    @Autowired
    FlightRepository flightRep;
    public FlightServiceImplementare(FlightRepository flightRepository){
        this.flightRep = flightRepository;
    }

    @Override
    public Flight findByNumber(String number) {
        return flightRep.findByNumber(number);
    }

    @Override
    public Optional<Flight> findById(Long id) {
        return flightRep.findById(id);
    }

    @Override
    public List<Flight> findByArrival(String arrival) {
        return flightRep.findByArrival(arrival);
    }

    @Override
    public List<Flight> findByDeparture(String departure) {
        return flightRep.findByDeparture(departure);
    }

    @Override
    public List<Flight> findByArrivalAndDeparture(String arrival, String departure) {
        return flightRep.findByArrivalAndDeparture(arrival, departure);
    }

    @Override
    public List<Flight> findAll() {
        return (List<Flight>) flightRep.findAll();
    }

    @Override
    public void anulateFlight(Long id) {
        flightRep.deleteById(id);
    }

    @Override
    public Flight updateFlight(Flight flight, int nr_seats) {
        flight.setNr_seats(nr_seats);
        flightRep.save(flight);
        return flight;
    }
}
