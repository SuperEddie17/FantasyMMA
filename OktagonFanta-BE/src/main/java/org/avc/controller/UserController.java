package org.avc.controller;

import org.avc.DTO.UserDTO;
import org.avc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("")
    public UserDTO newUser(@RequestBody UserDTO userDTO) {
        return userService.newUser(userDTO);
    }
    @PutMapping("/{userId}")
    public UserDTO editUser(@PathVariable Long userId, @RequestBody UserDTO userDTO) {
        return userService.editUser(userDTO, userId);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable Long userId) {
        userService.deleteUser(userId);
    }

    @GetMapping("/{userId}")
    public UserDTO getUser(@PathVariable Long userId) {
    return userService.findUserById(userId);
    }


}
