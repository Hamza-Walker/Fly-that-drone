package com.walker.model;

public class Drone {
    private Position position;


    public Drone(Position possition) {
        this.position = possition;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
