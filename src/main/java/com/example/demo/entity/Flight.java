package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter

public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String number;
    private String departure;
    private String arrival;
    private LocalDateTime date_time;
    private int nr_seats;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Ticket ticket;
}
