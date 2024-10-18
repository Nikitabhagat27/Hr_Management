package com.mapper;

import javax.servlet.http.HttpServletRequest;
import Dto.LoginDetail;

public class LoginMapper {
    public LoginDetail LoginDetail(HttpServletRequest request) {
        LoginDetail logindetail = new LoginDetail();
        logindetail.setUsername(request.getParameter("username")); // Ensure 'username' matches input field name
        logindetail.setPassword(request.getParameter("password")); // Ensure 'password' matches input field name
        return logindetail;
    }
}
