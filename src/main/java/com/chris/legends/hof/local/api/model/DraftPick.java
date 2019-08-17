package com.chris.legends.hof.local.api.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class DraftPick {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "draft_pick_id")
    private Integer id;

    @Column(nullable = false)
    private Integer roundNumber;

    @Column(nullable = false)
    private Integer pickNumber;

    @ManyToOne
    @JoinColumn(name="draft_id",
                foreignKey = @ForeignKey(name = "DRAFT_ID_FK"),
                nullable = false)
    @JsonBackReference
    private Draft draft;

    @ManyToOne
    @JoinColumn(name = "player_id",
                foreignKey = @ForeignKey(name = "PLAYER_ID_FK"),
                nullable = false)
    private Player player;

    @ManyToOne
    @JoinColumn(name = "owner_id",
                foreignKey = @ForeignKey(name = "OWNER_ID_FK"),
                nullable = false)
    private Owner owner;
}
