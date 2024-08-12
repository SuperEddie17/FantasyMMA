package org.avc.DTO.mapper;

import org.avc.DTO.EventDTO;
import org.avc.entity.EventEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface EventMapper {
    EventDTO toDTO(EventEntity source);

    EventEntity toEntity(EventDTO source);

    @Mapping(target = "id", ignore = true)
    void updateEventEntity(EventDTO source, @MappingTarget EventEntity target);
}
