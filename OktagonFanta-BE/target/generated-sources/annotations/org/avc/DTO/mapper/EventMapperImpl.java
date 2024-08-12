package org.avc.DTO.mapper;

import javax.annotation.processing.Generated;
import org.avc.DTO.EventDTO;
import org.avc.entity.EventEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19 (Oracle Corporation)"
)
@Component
public class EventMapperImpl implements EventMapper {

    @Override
    public EventDTO toDTO(EventEntity source) {
        if ( source == null ) {
            return null;
        }

        EventDTO eventDTO = new EventDTO();

        eventDTO.setId( source.getId() );
        eventDTO.setName( source.getName() );
        eventDTO.setDate( source.getDate() );

        return eventDTO;
    }

    @Override
    public EventEntity toEntity(EventDTO source) {
        if ( source == null ) {
            return null;
        }

        EventEntity eventEntity = new EventEntity();

        eventEntity.setId( source.getId() );
        eventEntity.setName( source.getName() );
        eventEntity.setDate( source.getDate() );

        return eventEntity;
    }

    @Override
    public void updateEventEntity(EventDTO source, EventEntity target) {
        if ( source == null ) {
            return;
        }

        target.setName( source.getName() );
        target.setDate( source.getDate() );
    }
}
