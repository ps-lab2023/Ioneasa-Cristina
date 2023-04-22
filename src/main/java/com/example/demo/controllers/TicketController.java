package com.example.demo.controllers;

import com.example.demo.Repository.TicketRepository;
import com.example.demo.Service.TicketService;
import com.example.demo.Service.UserService;
import com.example.demo.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/ticket")
public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @DeleteMapping("/deleteTicket")
    public boolean deleteTicket(@RequestParam Long noTicket) {
        return ticketService.deleteTicket(noTicket);
    }

    @PutMapping("/updatePrice")
    public Ticket updatePrice(@RequestBody Ticket ticket){
        return ticketService.modifyPrice(ticket, ticket.getPrice());
    }

}
