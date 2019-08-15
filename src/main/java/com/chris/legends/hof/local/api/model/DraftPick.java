package com.chris.legends.hof.local.api.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Data
@Entity
public class DraftPick {

    private Integer id;

    @OneToOne
    @MapsId
    private Player player;

    @OneToOne
    @MapsId
    private Owner owner;
}
