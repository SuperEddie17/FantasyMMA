package org.avc.DTO.mapper;

import javax.annotation.processing.Generated;
import org.avc.DTO.FighterStatsDTO;
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
        fighterStatsDTO.setStrikes( source.getStrikes() );
        fighterStatsDTO.setSignificantStrikes( source.getSignificantStrikes() );
        fighterStatsDTO.setTakedowns( source.getTakedowns() );
        fighterStatsDTO.setAttendedSubmissions( source.getAttendedSubmissions() );
        fighterStatsDTO.setSubWin( source.isSubWin() );
        fighterStatsDTO.setTkoWin( source.isTkoWin() );
        fighterStatsDTO.setDecWin( source.isDecWin() );
        fighterStatsDTO.setUnderdog( source.isUnderdog() );
        if ( source.getPoints() != null ) {
            fighterStatsDTO.setPoints( source.getPoints() );
        }

        return fighterStatsDTO;
    }

    @Override
    public FighterStatsEntity toEntity(FighterStatsDTO source) {
        if ( source == null ) {
            return null;
        }

        FighterStatsEntity fighterStatsEntity = new FighterStatsEntity();

        fighterStatsEntity.setId( source.getId() );
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

        target.setId( source.getId() );
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
}
