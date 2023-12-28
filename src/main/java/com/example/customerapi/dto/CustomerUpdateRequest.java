package com.example.customerapi.dto;

public record CustomerUpdateRequest(
        String name,
        String email,
        Integer age
) {
}
