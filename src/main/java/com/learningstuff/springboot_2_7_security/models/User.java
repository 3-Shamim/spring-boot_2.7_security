package com.learningstuff.springboot_2_7_security.models;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim Molla
 * Email: shamim.molla@vivasoftltd.com
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull(message = "Username must not be null")
    @Size(min = 0, max = 255, message = "Username must be between {min} to {max}")
    @Column(unique = true)
    private String username;

    @NotNull(message = "Password must not be null")
    @Size(min = 0, max = 255, message = "Password must be between {min} to {max}")
    private String password;

}
