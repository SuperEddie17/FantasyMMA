package org.avc.DTO.mapper;

import org.avc.DTO.FighterDTO;
import org.avc.entity.FighterEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface FighterMapper {
    FighterDTO toDTO(FighterEntity source);

    FighterEntity toEntity(FighterDTO source);

    @Mapping(target = "id", ignore = true)
    void updateFighterEntity(FighterDTO source,@MappingTarget FighterEntity target);
}
