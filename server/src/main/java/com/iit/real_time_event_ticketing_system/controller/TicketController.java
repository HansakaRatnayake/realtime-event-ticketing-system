package com.iit.real_time_event_ticketing_system.controller;

import com.iit.real_time_event_ticketing_system.model.Ticket;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tickets")
public class TicketController {

    @GetMapping
    public List<Ticket> getAllTickets() {
        return null;
    }


    @PostMapping
    public boolean addTicket(@RequestBody Ticket ticket){
        return true;
    }

    @PutMapping
    public boolean updateTicket(@RequestBody Ticket ticket){
        return true;
    }

    @DeleteMapping
    public boolean deleteTicket(Integer id){
        return true;
    }

}
