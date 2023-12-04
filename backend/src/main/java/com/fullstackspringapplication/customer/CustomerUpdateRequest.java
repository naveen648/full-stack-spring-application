package com.fullstackspringapplication.customer;

public record CustomerUpdateRequest(
        String name,
        String email,
        Integer age
) {
}
