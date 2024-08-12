package org.avc.DTO.mapper;


import org.avc.DTO.UserDTO;
import org.avc.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
   UserDTO toDTO(UserEntity source);

   UserEntity toEntity(UserDTO source);

   @Mapping(target = "id", ignore = true)
   void updateUserEntity(UserDTO source, @MappingTarget UserEntity target);
}
