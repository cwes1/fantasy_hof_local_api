package com.chris.legends.hof.local.api.model;

import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

@Data
@Entity
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @NaturalId
    @Column(nullable = false, unique = true)
    private String email;

    @NaturalId
    @Column(nullable = false, unique = true)
    private String phoneNumber;

    @OneToOne
    @JoinColumn(name="keeper_player_id",
                foreignKey = @ForeignKey(name = "KEEPER_PLAYER_ID"))
    private Player keeper;

}
