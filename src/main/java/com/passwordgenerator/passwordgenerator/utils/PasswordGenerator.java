package com.passwordgenerator.passwordgenerator.utils;

import java.util.Random;

public class PasswordGenerator {

    private static final String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&?";
    private static final Random random = new Random();

    public static String generate(Integer passwordLenght) {
        StringBuilder password = new StringBuilder();
        while (password.length() < passwordLenght) {
            int index = random.nextInt(characters.length());
            char nextChar = characters.charAt(index);
//            char nextChar = characters.charAt(random.nextInt(characters.length()));
            password.append(nextChar);
        }
        return password.toString();
    }
}
