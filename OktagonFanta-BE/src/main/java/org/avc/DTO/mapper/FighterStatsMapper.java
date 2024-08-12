package org.avc.DTO.mapper;

import org.avc.DTO.FighterStatsDTO;
import org.avc.entity.FighterStatsEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface FighterStatsMapper {
    FighterStatsDTO toDTO(FighterStatsEntity source);
    FighterStatsEntity toEntity(FighterStatsDTO source);
    void updateFighterStatsEntity(FighterStatsDTO source,@MappingTarget FighterStatsEntity target);
}
