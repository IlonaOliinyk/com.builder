package com.company;

public class Main {

    public static void main(String[] args) {
        Email newEmail = new Email.Builder("ilona.oliinyk@gmail.com")
                .cc("iliglf")
                .body("jdklf")
                .priority(1)
                .build();


    }
}
