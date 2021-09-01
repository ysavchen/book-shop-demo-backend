package com.mycompany.online_shop_backend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterResponse {

    private String token;
    private long tokenExpiration;
    private RegisteredUserDto registeredUser;

}
