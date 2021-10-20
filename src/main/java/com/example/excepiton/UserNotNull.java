package com.example.excepiton;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@Getter
@ToString
@AllArgsConstructor
public class UserNotNull {

    @NotNull(message = "name must not be null")
    private final String name;
}