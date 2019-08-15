package com.chris.legends.hof.local.api.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Draft {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String year;

    private String location;

  //  private Iterable<DraftRound> rounds;

}
