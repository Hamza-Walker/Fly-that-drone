package service;

import com.walker.model.Drone;
import com.walker.model.Position;
import com.walker.service.DiagonalMovementEngine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DiagonalMovementEngineTest {
    private DiagonalMovementEngine diagonalMovementEngine;
    private Drone drone;

    @BeforeEach
    public void setup() {
        Position position = new Position(1,2,3);
        diagonalMovementEngine = new DiagonalMovementEngine();
        drone = new Drone(position);
    }

    @Test
    public void testMoveForwardLeft() {
        diagonalMovementEngine.move(drone, "Forward-Left");
        // Add assertions to verify the drone's movement
    }

    @Test
    public void testMoveForwardRight() {
        diagonalMovementEngine.move(drone, "Forward-Right");
        // Add assertions to verify the drone's movement
    }

    @Test
    public void testMoveBackwardLeft() {
        diagonalMovementEngine.move(drone, "Backward-Left");
        // Add assertions to verify the drone's movement
    }

    @Test
    public void testMoveBackwardRight() {
        diagonalMovementEngine.move(drone, "Backward-Right");
        // Add assertions to verify the drone's movement
    }

    // Add more tests for other commands and scenarios
}
