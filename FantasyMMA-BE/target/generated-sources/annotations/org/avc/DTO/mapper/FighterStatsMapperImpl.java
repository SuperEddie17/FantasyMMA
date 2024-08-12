package org.avc.DTO.mapper;

import javax.annotation.processing.Generated;
import org.avc.DTO.EventDTO;
import org.avc.DTO.FighterDTO;
import org.avc.DTO.FighterStatsDTO;
import org.avc.entity.EventEntity;
import org.avc.entity.FighterEntity;
import org.avc.entity.FighterStatsEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19 (Oracle Corporation)"
)
@Component
public class FighterStatsMapperImpl implements FighterStatsMapper {

    @Override
    public FighterStatsDTO toDTO(FighterStatsEntity source) {
        if ( source == null ) {
            return null;
        }

        FighterStatsDTO fighterStatsDTO = new FighterStatsDTO();

        fighterStatsDTO.setId( source.getId() );
        fighterStatsDTO.setFighter( fighterEntityToFighterDTO( source.getFighter() ) );
        fighterStatsDTO.setEvent( eventEntityToEventDTO( source.getEvent() ) );
        fighterStatsDTO.setStrikes( source.getStrikes() );
        fighterStatsDTO.setSignificantStrikes( source.getSignificantStrikes() );
        fighterStatsDTO.setTakedowns( source.getTakedowns() );
        fighterStatsDTO.setAttendedSubmissions( source.getAttendedSubmissions() );
        fighterStatsDTO.setSubWin( source.isSubWin() );
        fighterStatsDTO.setTkoWin( source.isTkoWin() );
        fighterStatsDTO.setDecWin( source.isDecWin() );
        fighterStatsDTO.setUnderdog( source.isUnderdog() );
        fighterStatsDTO.setPoints( source.getPoints() );

        return fighterStatsDTO;
    }

    @Override
    public FighterStatsEntity toEntity(FighterStatsDTO source) {
        if ( source == null ) {
            return null;
        }

        FighterStatsEntity fighterStatsEntity = new FighterStatsEntity();

        fighterStatsEntity.setId( source.getId() );
        fighterStatsEntity.setFighter( fighterDTOToFighterEntity( source.getFighter() ) );
        fighterStatsEntity.setEvent( eventDTOToEventEntity( source.getEvent() ) );
        fighterStatsEntity.setStrikes( source.getStrikes() );
        fighterStatsEntity.setSignificantStrikes( source.getSignificantStrikes() );
        fighterStatsEntity.setTakedowns( source.getTakedowns() );
        fighterStatsEntity.setAttendedSubmissions( source.getAttendedSubmissions() );
        fighterStatsEntity.setSubWin( source.isSubWin() );
        fighterStatsEntity.setTkoWin( source.isTkoWin() );
        fighterStatsEntity.setDecWin( source.isDecWin() );
        fighterStatsEntity.setUnderdog( source.isUnderdog() );
        fighterStatsEntity.setPoints( source.getPoints() );

        return fighterStatsEntity;
    }

    @Override
    public void updateFighterStatsEntity(FighterStatsDTO source, FighterStatsEntity target) {
        if ( source == null ) {
            return;
        }

        target.setStrikes( source.getStrikes() );
        target.setSignificantStrikes( source.getSignificantStrikes() );
        target.setTakedowns( source.getTakedowns() );
        target.setAttendedSubmissions( source.getAttendedSubmissions() );
        target.setSubWin( source.isSubWin() );
        target.setTkoWin( source.isTkoWin() );
        target.setDecWin( source.isDecWin() );
        target.setUnderdog( source.isUnderdog() );
        target.setPoints( source.getPoints() );
    }

    protected FighterDTO fighterEntityToFighterDTO(FighterEntity fighterEntity) {
        if ( fighterEntity == null ) {
            return null;
        }

        FighterDTO fighterDTO = new FighterDTO();

        fighterDTO.setId( fighterEntity.getId() );
        fighterDTO.setName( fighterEntity.getName() );
        fighterDTO.setSurname( fighterEntity.getSurname() );
        fighterDTO.setWeightClass( fighterEntity.getWeightClass() );
        fighterDTO.setPrice( fighterEntity.getPrice() );
        fighterDTO.setPoints( fighterEntity.getPoints() );

        return fighterDTO;
    }

    protected EventDTO eventEntityToEventDTO(EventEntity eventEntity) {
        if ( eventEntity == null ) {
            return null;
        }

        EventDTO eventDTO = new EventDTO();

        eventDTO.setId( eventEntity.getId() );
        eventDTO.setName( eventEntity.getName() );
        eventDTO.setDate( eventEntity.getDate() );

        return eventDTO;
    }

    protected FighterEntity fighterDTOToFighterEntity(FighterDTO fighterDTO) {
        if ( fighterDTO == null ) {
            return null;
        }

        FighterEntity fighterEntity = new FighterEntity();

        fighterEntity.setId( fighterDTO.getId() );
        fighterEntity.setName( fighterDTO.getName() );
        fighterEntity.setSurname( fighterDTO.getSurname() );
        fighterEntity.setWeightClass( fighterDTO.getWeightClass() );
        fighterEntity.setPrice( fighterDTO.getPrice() );
        fighterEntity.setPoints( fighterDTO.getPoints() );

        return fighterEntity;
    }

    protected EventEntity eventDTOToEventEntity(EventDTO eventDTO) {
        if ( eventDTO == null ) {
            return null;
        }

        EventEntity eventEntity = new EventEntity();

        eventEntity.setId( eventDTO.getId() );
        eventEntity.setName( eventDTO.getName() );
        eventEntity.setDate( eventDTO.getDate() );

        return eventEntity;
    }
}
