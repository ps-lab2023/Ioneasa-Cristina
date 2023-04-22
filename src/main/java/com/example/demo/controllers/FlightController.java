package com.example.demo.controllers;

import com.example.demo.Service.FlightService;
import com.example.demo.controllers.DTO.FlightDTO;
import com.example.demo.entity.Flight;
import com.example.demo.entity.Ticket;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/flight")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping("/findAll")
    public ResponseEntity<List<FlightDTO>> findAll() {
        return ResponseEntity.ok(flightService.findAll());
    }

    @GetMapping("/findByArrival")
    public ResponseEntity<List<Flight>> findByArrival(@RequestParam String arrival){
        return ResponseEntity.ok(flightService.findByArrival(arrival));
    }

    @GetMapping("/findByDeparture")
    public ResponseEntity<List<Flight>> findByDeparture(@RequestParam String departure){
        return ResponseEntity.ok(flightService.findByDeparture(departure));
    }

    @PutMapping("/updateNrSeats")
    public Flight updateNrSeats(@RequestBody Flight flight){
        return flightService.updateFlight(flight, flight.getNr_seats());
    }

    @DeleteMapping("/deleteFlight")
    public void anulateFlight(@RequestParam Long id){
        flightService.anulateFlight(id);
    }
}
