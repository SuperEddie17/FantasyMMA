package org.avc.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "fighter_assignment")
@Getter
@Setter
public class FighterAssignmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "team_id", nullable = false)
    TeamEntity team;

    @ManyToOne
    @JoinColumn(name = "fighter_id", nullable = false)
    private FighterEntity fighter;

    @Column(name = "is_active")
    private boolean isActive;



}
