package com.iit.real_time_event_ticketing_system.service;

import com.iit.real_time_event_ticketing_system.model.Ticket;

import java.util.List;

public interface TicketService {

    public boolean createTicket(Ticket ticket);
    public List<Ticket> findAllTickets();
    public boolean updateTicket(Ticket ticket);
    public boolean deleteTicket(Integer id);

}
