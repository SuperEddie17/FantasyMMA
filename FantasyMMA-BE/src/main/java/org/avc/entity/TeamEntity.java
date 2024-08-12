package org.avc.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.Set;

@Entity(name = "teams")
@Getter
@Setter
public class TeamEntity {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user; ;

    @OneToMany(mappedBy = "team")
    private Set<FighterAssignmentEntity> activeFighters;

    @OneToMany(mappedBy = "team")
    private Set<FighterAssignmentEntity> benchFighters;

    @ElementCollection
    @MapKeyColumn(name = "fighter_id")
    @Column(name = "bonus_type")
    @CollectionTable(name = "team_fighter_bonuses", joinColumns = @JoinColumn(name = "team_id"))
    private Map<Long, String> fighterBonuses;  // Map of fighter IDs to bonus types
}
