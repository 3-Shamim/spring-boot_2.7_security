package com.learningstuff.springboot_2_7_security.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */
public class SecurityUtil {

    public static String encode(String value) {
        return new BCryptPasswordEncoder().encode(value);
    }

}
