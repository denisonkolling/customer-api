package com.example.customerapi.dto;


import com.example.customerapi.model.Gender;

import java.util.List;

public record CustomerDTO (
        Integer id,
        String name,
        String email,
        Gender gender,
        Integer age,
        List<String> roles,
        String username
){

}