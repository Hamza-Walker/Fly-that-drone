package com.walker.service;

import com.walker.model.Drone;

public class DiagonalMovementEngine extends MovementEngine {
    @Override
    public void move(Drone drone, String command) {
        switch (command) {
            case "Forward-Left":
                moveForwardLeft(drone);
                break;
            case "Forward-Right":
                moveForwardRight(drone);
                break;
            case "Backward-Left":
                moveBackwardLeft(drone);
                break;
            case "Backward-Right":
                moveBackwardRight(drone);
                break;
            default:
                super.move(drone, command); // Delegate to the parent class for other commands
        }
    }

    private void moveForwardLeft(Drone drone) {
        // Move the drone forward and then to the left
        moveForward(drone);
        moveLeft(drone);
    }

    private void moveForwardRight(Drone drone) {
        // Move the drone forward and then to the right
        moveForward(drone);
        moveRight(drone);
    }

    private void moveBackwardLeft(Drone drone) {
        // Move the drone backward and then to the left
        moveBackward(drone);
        moveLeft(drone);
    }

    private void moveBackwardRight(Drone drone) {
        // Move the drone backward and then to the right
        moveBackward(drone);
        moveRight(drone);
    }
}
