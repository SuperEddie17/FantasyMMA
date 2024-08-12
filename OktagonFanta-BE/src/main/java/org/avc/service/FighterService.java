package org.avc.service;

import org.avc.DTO.FighterDTO;

public interface FighterService {
    FighterDTO newFighter(FighterDTO fighterDTO);

    void deleteFighter(Long id);

    FighterDTO editFighter(FighterDTO fighterDTO, Long id);

    FighterDTO findFighterById(Long id);
}
