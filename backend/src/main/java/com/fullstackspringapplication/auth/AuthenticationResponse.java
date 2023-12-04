package com.fullstackspringapplication.auth;

import com.fullstackspringapplication.customer.CustomerDTO;

public record AuthenticationResponse (
        String token,
        CustomerDTO customerDTO){
}
