package com.walker.service;

import com.walker.model.Drone;
import com.walker.model.Position;

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
        Position currentPosition = drone.getPosition();
        Position newPosition = new Position(currentPosition.x(), currentPosition.y(), currentPosition.z() + 1);
        drone.setPosition(newPosition);
    }

    private void moveDown(Drone drone) {
        Position currentPosition = drone.getPosition();
        Position newPosition = new Position(currentPosition.x(), currentPosition.y(), currentPosition.z() - 1);
        drone.setPosition(newPosition);
    }
}
