package org.avc.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "fighter_stats")
@Getter
@Setter
public class FighterStatsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "fighter_id", nullable = false)
    private FighterEntity fighter;

    @ManyToOne
    @JoinColumn(name = "event_id", nullable = false)
    private EventEntity event;

    private int strikes;

    private int significantStrikes;

    private int takedowns;

    private int attendedSubmissions;

    private boolean subWin;

    private boolean tkoWin;

    private boolean decWin;

    private boolean underdog;

    private Long points;

}
