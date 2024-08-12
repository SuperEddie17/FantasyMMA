package org.avc.DTO;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.avc.entity.EventEntity;
import org.avc.entity.FighterEntity;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FighterStatsDTO {


    @JsonProperty("_id")
    private Long id;

    private FighterDTO fighter;

    private EventDTO event;

    private int strikes;

    private int significantStrikes;

    private int takedowns;

    private int attendedSubmissions;

    private boolean subWin;

    private boolean tkoWin;

    private boolean decWin;

    private boolean underdog;

    private int points;








}
