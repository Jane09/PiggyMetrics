package com.piggymetrics.jwt.security;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class JwtAuthenticationResponse implements Serializable {
    private final String token;
}
