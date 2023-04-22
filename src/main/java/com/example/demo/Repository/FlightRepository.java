package com.example.demo.Repository;

import com.example.demo.entity.Flight;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface FlightRepository extends CrudRepository<Flight, Long> {
    Flight findByNumber(String number);
    @Transactional
    List<Flight> findByArrival(String arrival);
    List<Flight> findByDeparture(String departure);
    List<Flight> findByArrivalAndDeparture(String arrival, String departure);
    @Transactional
    void deleteById(Long id);

}
