package com.chris.legends.hof.local.api.model;


import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class DraftRound {

    private Integer id;
    private Integer roundNumber;
   // private Iterable<DraftPick> picks;

}
