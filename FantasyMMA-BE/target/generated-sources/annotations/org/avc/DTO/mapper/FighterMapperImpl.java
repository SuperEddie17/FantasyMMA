package org.avc.DTO.mapper;

import javax.annotation.processing.Generated;
import org.avc.DTO.FighterDTO;
import org.avc.entity.FighterEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19 (Oracle Corporation)"
)
@Component
public class FighterMapperImpl implements FighterMapper {

    @Override
    public FighterDTO toDTO(FighterEntity source) {
        if ( source == null ) {
            return null;
        }

        FighterDTO fighterDTO = new FighterDTO();

        fighterDTO.setId( source.getId() );
        fighterDTO.setName( source.getName() );
        fighterDTO.setSurname( source.getSurname() );
        fighterDTO.setWeightClass( source.getWeightClass() );
        fighterDTO.setPrice( source.getPrice() );
        fighterDTO.setPoints( source.getPoints() );

        return fighterDTO;
    }

    @Override
    public FighterEntity toEntity(FighterDTO source) {
        if ( source == null ) {
            return null;
        }

        FighterEntity fighterEntity = new FighterEntity();

        fighterEntity.setId( source.getId() );
        fighterEntity.setName( source.getName() );
        fighterEntity.setSurname( source.getSurname() );
        fighterEntity.setWeightClass( source.getWeightClass() );
        fighterEntity.setPrice( source.getPrice() );

        return fighterEntity;
    }

    @Override
    public void updateFighterEntity(FighterDTO source, FighterEntity target) {
        if ( source == null ) {
            return;
        }

        target.setName( source.getName() );
        target.setSurname( source.getSurname() );
        target.setWeightClass( source.getWeightClass() );
        target.setPrice( source.getPrice() );
        target.setPoints( source.getPoints() );
    }
}
