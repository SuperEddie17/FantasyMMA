package org.avc.service;

import org.avc.DTO.FighterStatsDTO;

public interface FighterStatsService {

    FighterStatsDTO newFighterStats(FighterStatsDTO fighterStatsDTO);

    FighterStatsDTO editFighterStats(FighterStatsDTO fighterStatsDTO, Long id);

    void deleteFighterStats(Long id);

    FighterStatsDTO findFighterStatsById(Long id);

    FighterStatsDTO recalculatePoints(Long id);


}
