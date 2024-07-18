package com.example.tek_it_gitway_service.config;

import com.softkour.qrsta_server.entity.user.User;
import com.softkour.qrsta_server.security.JwtRequestFilter;
import com.softkour.qrsta_server.service.AuthService;

public class MyUtils {
    public static double courseCost = 20;
    public static double parentCost = 30;

    public static String getUserPhone(String logoutAndPhone) {
        return logoutAndPhone.substring(logoutAndPhone.indexOf('+') + 1);
    }

    public static User getCurrentUserSession(AuthService authService) {
        return authService.getUserByPhoneNumber(getUserPhone(JwtRequestFilter.username));
    }
}
