package com.iit.real_time_event_ticketing_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    private Integer id;
    private String name;
    private String contact;
    private String email;
}
