package com.example.customerapi.auth;

import com.example.customerapi.dto.CustomerDTO;

public record AuthenticationResponse (
        String token,
        CustomerDTO customerDTO){
}
