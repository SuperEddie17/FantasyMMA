package org.avc.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;


public class FighterAssignmentDTO {

    @JsonProperty("_id")
    private Long id;


    private Long teamId;


    private Long fighterId;


    private boolean isActive;
}
