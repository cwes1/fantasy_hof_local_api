package com.chris.legends.hof.local.api.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Performance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="performance_id")
    private Integer id;

    //TODO: figure out relationship
    private Player player;

    //private Week week;

    private Double score;
}
