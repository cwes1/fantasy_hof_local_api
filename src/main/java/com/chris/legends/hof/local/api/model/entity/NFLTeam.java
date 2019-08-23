package com.chris.legends.hof.local.api.model.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class NFLTeam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="nfl_team_id")
    private Integer id;

    private String location;

    private String locationAbbreviation;

    private String mascot;
}
