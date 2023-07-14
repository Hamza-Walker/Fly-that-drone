package service;

import com.walker.model.Drone;
import com.walker.model.Position;
import com.walker.service.AirMovementEngine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class  AirMovementEngineTest {
    private AirMovementEngine airMovementEngine;
    private Drone drone;

    @BeforeEach
    public void setup() {
        Position position = new Position(1,2,3);
        airMovementEngine = new AirMovementEngine();
        drone = new Drone(position);
    }

    @Test
    public void testMoveUp() {
        airMovementEngine.move(drone, "Up");
        // Add assertions to verify the drone's movement
    }

    @Test
    public void testMoveDown() {
        airMovementEngine.move(drone, "Down");
        // Add assertions to verify the drone's movement
    }

    // Add more tests for other commands and scenarios
}
