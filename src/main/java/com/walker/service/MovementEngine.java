package com.walker.service;

import com.walker.model.Drone;

import java.util.ArrayList;
import java.util.List;

public class MovementEngine {
    private final List<String> commands;

    public MovementEngine() {
        this.commands = new ArrayList<>();
        commands.add("Forward");
        commands.add("Backward");
        commands.add("Left");
        commands.add("Right");
    }

    public void move (Drone drone, String command){
        switch (command) {
            case "Forward" -> moveForward(drone);
            case "Backward" -> moveBackward(drone);
            case "Left" -> moveLeft(drone);
            case "Right" -> moveRight(drone);
            default -> System.out.println("Invalid command: " + command);
        }

    }
    public void moveForward(Drone drone) {
        // Implementation for moving the drone forward
        System.out.println("Moving drone forward");
    }

    public void moveBackward(Drone drone) {
        // Implementation for moving the drone backward
        System.out.println("Moving drone backward");
    }

    public void moveLeft(Drone drone) {
        // Implementation for moving the drone to the left
        System.out.println("Moving drone to the left");
    }

    public void moveRight(Drone drone) {
        // Implementation for moving the drone to the right
        System.out.println("Moving drone to the right");
    }

    public List<String> getCommands() {
        return commands;
    }

}
