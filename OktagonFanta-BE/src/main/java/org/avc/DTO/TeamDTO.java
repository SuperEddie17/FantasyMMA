package org.avc.DTO;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamDTO {

    @JsonProperty("_id")
    private Long id;
    private Long userId;
    private List<FighterDTO> activeFighters;  // Seznam aktivních zápasníků
    private List<FighterDTO> benchFighters;   // Seznam zápasníků na lavičce
    private Map<Long, String> fighterBonuses; // Mapa ID zápasníka na typ bonusu

}
