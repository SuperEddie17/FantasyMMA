package org.avc.service;

import jakarta.persistence.EntityNotFoundException;
import org.avc.DTO.FighterStatsDTO;
import org.avc.DTO.mapper.FighterStatsMapper;
import org.avc.entity.FighterStatsEntity;
import org.avc.entity.repository.EventRepository;
import org.avc.entity.repository.FighterRepository;
import org.avc.entity.repository.FighterStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FighterStatsServiceImpl implements FighterStatsService {
    @Autowired
    FighterStatsRepository fighterStatsRepository;

    @Autowired
    FighterStatsMapper fighterStatsMapper;

    @Autowired
    FighterRepository fighterRepository;

    @Autowired
    EventRepository eventRepository;

    @Override
    public FighterStatsDTO newFighterStats(FighterStatsDTO fighterStatsDTO) {
        FighterStatsEntity fighterStatsEntity = fighterStatsMapper.toEntity(fighterStatsDTO);
        fighterStatsEntity.setFighter(fighterRepository.findById(fighterStatsDTO.getFighter().getId()).orElseThrow());
        fighterStatsEntity.setEvent(eventRepository.findById(fighterStatsDTO.getEvent().getId()).orElseThrow());
        int points = calculatePoints(fighterStatsDTO);
        fighterStatsEntity.setPoints(points);
        fighterStatsRepository.saveAndFlush(fighterStatsEntity);
        return fighterStatsMapper.toDTO(fighterStatsEntity);
    }

    @Override
    public FighterStatsDTO editFighterStats(FighterStatsDTO fighterStatsDTO, Long id) {
        FighterStatsEntity fighterStatsEntity = fetchFighterStatsById(id);
        fighterStatsMapper.updateFighterStatsEntity(fighterStatsDTO, fighterStatsEntity);
        int points = calculatePoints(fighterStatsDTO);
        fighterStatsEntity.setPoints(points);
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

    @Override
    public FighterStatsDTO recalculatePoints(Long id){
        FighterStatsEntity fighterStatsEntity = fetchFighterStatsById(id);
        FighterStatsDTO fighterStatsDTO = fighterStatsMapper.toDTO(fighterStatsEntity);

        int points = calculatePoints(fighterStatsDTO);

        fighterStatsEntity.setPoints(points);
        fighterStatsRepository.saveAndFlush(fighterStatsEntity);

        return fighterStatsMapper.toDTO(fighterStatsEntity);
    }

    private FighterStatsEntity fetchFighterStatsById(Long id) {
        return fighterStatsRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("User with ID " + id + " not found."));
    }

    private int calculatePoints(FighterStatsDTO fighterStatsDTO){
        int points = 0;
        int significantPoints = 1;
        int finishWinPoints = 3;
        int takedownPoints = 3;

        //points for significants
        points += (fighterStatsDTO.getSignificantStrikes()/10)*significantPoints;

        //points for takedowns
        points += fighterStatsDTO.getTakedowns()*takedownPoints;

        //points for finish
        if (fighterStatsDTO.isSubWin() || fighterStatsDTO.isTkoWin()){
            points += finishWinPoints;
        }
        return points;
    }
}
