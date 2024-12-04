package com.iit.real_time_event_ticketing_system.service.impl;

import com.iit.real_time_event_ticketing_system.model.Ticket;
import com.iit.real_time_event_ticketing_system.service.TicketService;

import java.util.List;

public class TicketServiceImpl implements TicketService {
    @Override
    public boolean createTicket(Ticket ticket) {
        return false;
    }

    @Override
    public List<Ticket> findAllTickets() {
        return List.of();
    }

    @Override
    public boolean updateTicket(Ticket ticket) {
        return false;
    }

    @Override
    public boolean deleteTicket(Integer id) {
        return false;
    }
}
