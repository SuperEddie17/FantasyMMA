package org.avc.service;

import jakarta.persistence.EntityNotFoundException;
import org.avc.DTO.FighterStatsDTO;
import org.avc.DTO.mapper.FighterStatsMapper;
import org.avc.entity.FighterStatsEntity;
import org.avc.entity.repository.FighterStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FighterStatsServiceImpl implements FighterStatsService {
    @Autowired
    FighterStatsRepository fighterStatsRepository;

    @Autowired
    FighterStatsMapper fighterStatsMapper;

    @Override
    public FighterStatsDTO newFighterStats(FighterStatsDTO fighterStatsDTO) {
        FighterStatsEntity fighterStatsEntity = fighterStatsMapper.toEntity(fighterStatsDTO);
        fighterStatsRepository.saveAndFlush(fighterStatsEntity);
        return fighterStatsMapper.toDTO(fighterStatsEntity);
    }

    @Override
    public FighterStatsDTO editFighterStats(FighterStatsDTO fighterStatsDTO, Long id) {
        FighterStatsEntity fighterStatsEntity = fetchFighterStatsById(id);
        fighterStatsMapper.updateFighterStatsEntity(fighterStatsDTO, fighterStatsEntity);
        fighterStatsRepository.saveAndFlush(fighterStatsEntity);

        return fighterStatsMapper.toDTO(fighterStatsEntity);
    }

    @Override
    public void deleteFighterStats(Long id) {
        FighterStatsEntity fighterStatsEntity = fetchFighterStatsById(id);
        fighterStatsRepository.delete(fighterStatsEntity);

    }

    @Override
    public FighterStatsDTO findFighterStatsById(Long id) {
        FighterStatsEntity fighterStatsEntity = fetchFighterStatsById(id);
        return fighterStatsMapper.toDTO(fighterStatsEntity);
    }

    private FighterStatsEntity fetchFighterStatsById(Long id) {
        return fighterStatsRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("User with ID " + id + " not found."));
    }
}
