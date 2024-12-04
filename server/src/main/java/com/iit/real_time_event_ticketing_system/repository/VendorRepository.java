package com.iit.real_time_event_ticketing_system.repository;

import com.iit.real_time_event_ticketing_system.model.Ticket;
import com.iit.real_time_event_ticketing_system.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor,Integer> {

}
