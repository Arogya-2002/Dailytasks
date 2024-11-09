package com.example.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> getAllUsers() {
    	return userRepository.findAll().stream()
    			.map(user -> convertToDTO(user))
    			.collect(Collectors.toList());
    }
public UserDTO createUser(User user){
//	User user = convertToEntity(user);
	user = userRepository.save(user);
	return convertToDTO(user);
}

    private UserDTO convertToDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername(user.getUsername());
        userDTO.setEmail(user.getEmail());
        return userDTO;
    }

//    private User convertToEntity(UserDTO userDTO) {
//        User user = new User();
//        user.setUsername(userDTO.getUsername());
//        user.setEmail(userDTO.getEmail());
//        return user;
//    }
}
