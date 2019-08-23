package com.chris.legends.hof.local.api.model.entity;

import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

@Data
@Entity
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @NaturalId
    @Column(nullable = false)
    private String nickname;

    @NaturalId
    @Column(unique = true)
    private String email;

    @NaturalId
    @Column(unique = true)
    private String phoneNumber;

    @Column(name = "active_indicator", nullable = false)
    private Boolean isActive;

    @OneToOne
    @JoinColumn(name="keeper_player_id",
                foreignKey = @ForeignKey(name = "KEEPER_PLAYER_ID"))
    private Player keeper;

}
