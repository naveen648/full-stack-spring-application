package com.fullstackspringapplication.auth;

public record AuthenticationRequest(
        String username,
        String password
) {
}
