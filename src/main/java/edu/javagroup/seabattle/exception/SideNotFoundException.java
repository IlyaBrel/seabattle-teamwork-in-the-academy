package edu.javagroup.seabattle.exception;

import static edu.javagroup.seabattle.constants.Constants.ENEMY;
import static edu.javagroup.seabattle.constants.Constants.MINE;

public class SideNotFoundException extends RuntimeException {

    public SideNotFoundException() {
        this("Уточните сторону (" + MINE + " or " + ENEMY + ")");
    }

    public SideNotFoundException(String message) {
        super(message);
    }
}

