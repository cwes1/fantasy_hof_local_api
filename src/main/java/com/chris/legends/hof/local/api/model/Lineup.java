package com.chris.legends.hof.local.api.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Optional;

@Data
@Entity
public class Lineup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="lineup_id")
    private Integer id;

    //private Optional<Iterable<Performance>> performances;

}
