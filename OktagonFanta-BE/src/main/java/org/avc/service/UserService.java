package org.avc.service;

import org.avc.DTO.UserDTO;

public interface UserService {
    UserDTO newUser(UserDTO userDTO);

    UserDTO editUser(UserDTO userDTO, Long id);

    void deleteUser(Long id);

    UserDTO findUserById(Long id);
}
