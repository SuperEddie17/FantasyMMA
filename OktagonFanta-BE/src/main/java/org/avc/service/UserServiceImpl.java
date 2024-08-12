package org.avc.service;

import jakarta.persistence.EntityNotFoundException;
import org.avc.DTO.UserDTO;
import org.avc.DTO.mapper.UserMapper;
import org.avc.entity.UserEntity;
import org.avc.entity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO newUser(UserDTO userDTO) {
        UserEntity userEntity = userMapper.toEntity(userDTO);
        userEntity.setBudget(15.0);
        userRepository.saveAndFlush(userEntity);
        return userMapper.toDTO(userEntity);
    }

    @Override
    public UserDTO editUser(UserDTO userDTO, Long id) {
        UserEntity userEntity = fetchUserById(id);
        userMapper.updateUserEntity(userDTO, userEntity);
        userRepository.saveAndFlush(userEntity);

        return userMapper.toDTO(userEntity);
    }

    @Override
    public void deleteUser(Long id) {
        UserEntity userEntity =fetchUserById(id);
        userRepository.delete(userEntity);

    }

    @Override
    public UserDTO findUserById(Long id) {
        UserEntity userEntity = fetchUserById(id);
        return userMapper.toDTO(userEntity);
    }

    private UserEntity fetchUserById(Long id) {
        return userRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("User with ID " + id + " not found."));
    }
}

