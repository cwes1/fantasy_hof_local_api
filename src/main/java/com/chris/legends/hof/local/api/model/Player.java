package com.chris.legends.hof.local.api.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="player_id")
    private Integer id;

    private String firstName;

    private String lastName;


}
