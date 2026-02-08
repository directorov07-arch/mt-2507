package com.example.mt_2507.service;

import com.example.mt_2507.model.dto.UserDTO;
import java.util.List;

public interface UserService {
    UserDTO create(UserDTO dto);
    UserDTO getById(Long id);
    List<UserDTO> getAll();
    UserDTO update(Long id, UserDTO dto);
    void delete(Long id);
}