package org.avc.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import org.avc.entity.FighterEntity;
import org.avc.entity.TeamEntity;

public class FigterAssignmentDTO {

    @JsonProperty("_id")
    private Long id;


    private Long teamId;


    private Long fighterId;


    private boolean isActive;
}
