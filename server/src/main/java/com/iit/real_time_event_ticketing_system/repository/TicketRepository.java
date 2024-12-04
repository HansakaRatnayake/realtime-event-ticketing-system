package com.iit.real_time_event_ticketing_system.repository;

import com.iit.real_time_event_ticketing_system.model.Customer;
import com.iit.real_time_event_ticketing_system.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {

}
