package com.example.demo.Service;

import com.example.demo.Repository.TicketRepository;
import com.example.demo.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TicketServiceImplementare implements TicketService{

    @Autowired
    TicketRepository ticketRep;
    public TicketServiceImplementare(TicketRepository ticketRepository){
        this.ticketRep = ticketRepository;
    }

    @Override
    public Ticket findByNoTicket(Long number) {
        return ticketRep.findByNoTicket(number);
    }

    @Override
    public List<Ticket> findByPassagerName(String passagerName) {
        return ticketRep.findByPassagerName(passagerName);
    }

    @Override
    public boolean deleteTicket(Long noTicket) {
        ticketRep.deleteById(noTicket);
        if(ticketRep.existsById(noTicket))
            return false;
        else return true;
    }

    @Override
    public Ticket modifyPrice(Ticket ticket, int price) {
        ticket.setPrice(price);
        ticketRep.save(ticket);
        return ticket;
    }
}
