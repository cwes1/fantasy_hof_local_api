package com.chris.legends.hof.local.api.model;

import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
public class Draft {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NaturalId
    @Column(nullable = false, unique = true)
    private String year;

    @Column(nullable = false)
    private String location;

    @OneToMany(mappedBy = "draft", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<DraftRound> rounds;

}
