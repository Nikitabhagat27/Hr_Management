package com.factory;

import com.service.LoginService;
import com.mapper.LoginMapper;
import com.repository.LoginRepository;

public class LoginFactory {
    public static LoginService createLoginServiceInstance() {
        return new LoginService(); // Properly instantiate LoginService
    }

    public static LoginMapper createObjectMapperInstance() {
        return new LoginMapper(); // Properly instantiate LoginMapper
    }

    public static LoginRepository createLoginRepositoryInstance() {
        return new LoginRepository(); // Properly instantiate LoginRepository
    }
}
