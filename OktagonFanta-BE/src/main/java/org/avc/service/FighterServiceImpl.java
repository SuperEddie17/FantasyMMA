package org.avc.service;

import jakarta.persistence.EntityNotFoundException;
import org.avc.DTO.FighterDTO;
import org.avc.DTO.mapper.FighterMapper;
import org.avc.entity.FighterEntity;
import org.avc.entity.repository.FighterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FighterServiceImpl implements FighterService {

    @Autowired
    FighterMapper fighterMapper;

    @Autowired
    FighterRepository fighterRepository;

    @Override
    public FighterDTO newFighter(FighterDTO fighterDTO) {
        FighterEntity fighterEntity = fighterMapper.toEntity(fighterDTO);
        fighterEntity.setPoints(0);
        fighterRepository.saveAndFlush(fighterEntity);
        return fighterMapper.toDTO(fighterEntity);
    }

    @Override
    public void deleteFighter(Long id) {
        FighterEntity fighterEntity = fetchFighterById(id);
        fighterRepository.delete(fighterEntity);

    }

    @Override
    public FighterDTO editFighter(FighterDTO fighterDTO, Long id) {
        FighterEntity fighterEntity = fetchFighterById(id);
        fighterMapper.updateFighterEntity(fighterDTO, fighterEntity);
        fighterRepository.saveAndFlush(fighterEntity);
        return fighterMapper.toDTO(fighterEntity);
    }

    @Override
    public FighterDTO findFighterById(Long id) {
        FighterEntity fighterEntity = fetchFighterById(id);

        return fighterMapper.toDTO(fighterEntity);
    }

    private FighterEntity fetchFighterById(Long id) {
        return fighterRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("User with ID " + id + " not found."));
    }
}
