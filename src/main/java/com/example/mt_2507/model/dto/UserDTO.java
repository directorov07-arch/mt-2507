package com.example.mt_2507.model.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
}