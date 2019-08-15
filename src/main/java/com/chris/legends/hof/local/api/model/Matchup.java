package com.chris.legends.hof.local.api.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Matchup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "matchup_id")
    private Integer id;

    private String year;

    private Integer week;

    @Column(name = "home_owner_id")
    private Owner homeTeam;

    @Column(name = "away_owner_id")
    private Owner awayTeam;

    private Double homeScore;

    private Double awayScore;
}
