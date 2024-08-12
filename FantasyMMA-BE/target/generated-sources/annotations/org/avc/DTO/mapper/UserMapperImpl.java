package org.avc.DTO.mapper;

import javax.annotation.processing.Generated;
import org.avc.DTO.UserDTO;
import org.avc.entity.UserEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO toDTO(UserEntity source) {
        if ( source == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( source.getId() );
        userDTO.setNickname( source.getNickname() );
        userDTO.setEmail( source.getEmail() );
        userDTO.setBudget( source.getBudget() );

        return userDTO;
    }

    @Override
    public UserEntity toEntity(UserDTO source) {
        if ( source == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setId( source.getId() );
        userEntity.setNickname( source.getNickname() );
        userEntity.setEmail( source.getEmail() );
        userEntity.setBudget( source.getBudget() );

        return userEntity;
    }

    @Override
    public void updateUserEntity(UserDTO source, UserEntity target) {
        if ( source == null ) {
            return;
        }

        target.setNickname( source.getNickname() );
        target.setEmail( source.getEmail() );
        target.setBudget( source.getBudget() );
    }
}
