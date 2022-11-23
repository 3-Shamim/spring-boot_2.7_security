package com.learningstuff.springboot_2_7_security.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

@AllArgsConstructor
@RequestMapping(value =  "")
@RestController
public class BaseController {

    @GetMapping(value = "/")
    public ResponseEntity<?> baseUrl() {
        return ResponseEntity.status(HttpStatus.OK).body("Base URL");
    }

}
