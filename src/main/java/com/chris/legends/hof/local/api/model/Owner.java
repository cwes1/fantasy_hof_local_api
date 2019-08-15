package com.chris.legends.hof.local.api.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="owner_id")
    private Integer id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    private String email;

    private String phoneNumber;

    @OneToOne
    @JoinColumn(name="keeper_player_id")
    private Player keeper;

}
