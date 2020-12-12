package com.cyberteck.test;

import com.github.javafaker.Address;
import com.github.javafaker.Faker;

public class FirstClass {
    public static void main(String[] args) {
        Faker faker = new Faker();
        String fullName = faker.name().fullName();

        System.out.println(fullName);
    }
}
