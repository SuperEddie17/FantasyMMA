package org.avc.DTO.mapper;

import org.avc.DTO.FighterStatsDTO;
import org.avc.entity.EventEntity;
import org.avc.entity.FighterStatsEntity;
import org.avc.service.EventService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public interface FighterStatsMapper {



    FighterStatsDTO toDTO(FighterStatsEntity source);


    FighterStatsEntity toEntity(FighterStatsDTO source);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "fighter", ignore = true)
    @Mapping(target = "event", ignore = true)
    void updateFighterStatsEntity(FighterStatsDTO source,@MappingTarget FighterStatsEntity target);
}

