package com.walker.service;

import com.walker.model.Drone;

public class AirMovementEngine extends MovementEngine {
    @Override
    public void move(Drone drone, String command) {
        switch (command) {
            case "Up":
                moveUp(drone);
                break;
            case "Down":
                moveDown(drone);
                break;
            default:
                super.move(drone, command); // Delegate to the parent class for other commands
        }
    }

    private void moveUp(Drone drone) {
        // Implementation for moving the drone up
        System.out.println("Moving drone up");
    }

    private void moveDown(Drone drone) {
        // Implementation for moving the drone down
        System.out.println("Moving drone down");
    }
}
