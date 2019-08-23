package com.chris.legends.hof.local.api.model.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
@Entity
public class Matchup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String season;

    @Column(nullable = false)
    private Integer week;

    @ManyToOne
    @JoinColumn(name = "away_owner_id",
            foreignKey = @ForeignKey(name = "AWAY_OWNER_ID_FK"),
            nullable = false)
    private Owner awayOwner;

    @Column(nullable = false)
    private Double awayScore;

    @ManyToOne
    @JoinColumn(name = "home_owner_id",
            foreignKey = @ForeignKey(name = "HOME_OWNER_ID_FK"),
            nullable = false)
    private Owner homeOwner;

    @Column(nullable = false)
    private Double homeScore;

    @Column(nullable = false)
    private Boolean playoffIndicator;

}
