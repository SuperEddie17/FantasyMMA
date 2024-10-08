package org.avc.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name = "fighters")
@Getter
@Setter
public class FighterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String surname;

    private String weightClass;

    private double price;

    private int points;

    @OneToMany(mappedBy = "fighter")
    private List<FighterStatsEntity> fighterStats;
}
