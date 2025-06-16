package com.pluralsight.service;

public class StudentAlreadyRegisteredException extends Exception {
    

    public StudentAlreadyRegisteredException(String message) {
        super(message);
    }

    public StudentAlreadyRegisteredException() {
        super("El estudiante ya está registrado");
    }


    public StudentAlreadyRegisteredException(String message, Throwable cause) {
        super(message, cause);
    }
} 
