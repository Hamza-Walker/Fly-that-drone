package service;

import com.walker.model.Drone;
import com.walker.model.Position;
import com.walker.service.MovementEngine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MovementEngineTest {
    private MovementEngine movementEngine;
    private Drone drone;
    private final Position position = new Position(6 ,7, 8);
    @BeforeEach
    public void setup() {
        movementEngine = new MovementEngine();
        drone = new Drone(position);
    }

    @Test
    public void testMoveForward() {
        movementEngine.move(drone, "Forward");
        // Assert that the drone has moved forward (add your own assertions here)
    }

    @Test
    public void testMoveBackward() {
        movementEngine.move(drone, "Backward");
        // Assert that the drone has moved backward (add your own assertions here)
    }

    @Test
    public void testMoveLeft() {
        movementEngine.move(drone, "Left");
        // Assert that the drone has moved to the left (add your own assertions here)
    }

    @Test
    public void testMoveRight() {
        movementEngine.move(drone, "Right");
        // Assert that the drone has moved to the right (add your own assertions here)
    }

    @Test
    public void testInvalidCommand() {
        // Test an invalid command
        movementEngine.move(drone, "Up");
        // Assert that the output indicates an invalid command (add your own assertions here)
    }

    @Test
    public void testGetCommands() {
        List<String> commands = movementEngine.getCommands();
        Assertions.assertEquals(4, commands.size());
        Assertions.assertTrue(commands.contains("Forward"));
        Assertions.assertTrue(commands.contains("Backward"));
        Assertions.assertTrue(commands.contains("Left"));
        Assertions.assertTrue(commands.contains("Right"));
    }
}
