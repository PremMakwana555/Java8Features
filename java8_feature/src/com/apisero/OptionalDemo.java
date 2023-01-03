package com.apisero;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        String[] str = new String[5];

        // Setting value for 2nd index
        str[2] = "I am vengeance, I am the night, I am Batman!";

        // It returns a non-empty Optional
        Optional<String> value = Optional.of(str[2]);

        // It returns value of an Optional.
        // If value is not present, it throws
        // an NoSuchElementException
        System.out.println(value.get());

        // It returns true if value is present,
        // otherwise false
        System.out.println(value.isPresent());

    }
}
