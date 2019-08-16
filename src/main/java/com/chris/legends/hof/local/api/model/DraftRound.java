package com.chris.legends.hof.local.api.model;


import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
public class DraftRound {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "draft_round_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "draft_id")
    private Draft draft;

    private Integer roundNumber;

    @OneToMany(mappedBy = "round", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<DraftPick> picks;

}
