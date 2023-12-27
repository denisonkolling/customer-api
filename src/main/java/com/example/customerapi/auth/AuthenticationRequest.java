package com.example.customerapi.auth;

public record AuthenticationRequest(
        String username,
        String password
) {
}