package com.edureka.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Army {
    @GeneratedValue
    @Id
    private Long id;

    private Long personId;
    private int dragons;
    private int knights;
    private int soldiers;
    private int ships;
}
