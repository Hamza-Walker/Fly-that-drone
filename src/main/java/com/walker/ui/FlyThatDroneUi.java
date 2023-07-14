package com.walker.ui;

import com.walker.model.Drone;
import com.walker.service.MovementEngine;

import java.util.Scanner;

import static java.util.stream.Collectors.joining;

public class FlyThatDroneUi {
    private final Drone drone;
    private final MovementEngine movementEngine;
    private final Scanner scanner;

    public FlyThatDroneUi(Drone drone, MovementEngine movementEngine, Scanner scanner) {
        this.drone = drone;
        this.movementEngine = movementEngine;
        this.scanner = scanner;
    }
    public void start() {
        while (true) {
            displayMenu();
            handleChoice();
        }
    }
    private void displayMenu() {
        System.out.println("\n*** Fly That Drone ***");
        System.out.println("\nCurrent drone position: " + drone.getPosition());
        System.out.println("Available movements:\n" + getMovementNames());
    }
    private void handleChoice() {
        System.out.print("\nChoice: ");
        String choice = scanner.next();
        movementEngine.move(drone, choice);
    }
    private String getMovementNames() {
        return movementEngine.getCommands().stream()
                .collect(joining(", "));
    }
}
