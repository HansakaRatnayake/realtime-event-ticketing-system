package com.iit.real_time_event_ticketing_system.repository;

import com.iit.real_time_event_ticketing_system.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer,Integer> {

}
