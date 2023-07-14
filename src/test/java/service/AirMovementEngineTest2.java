package service;

import com.walker.model.Drone;
import com.walker.model.Position;
import com.walker.service.AirMovementEngine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirMovementEngineTest2 {
    private AirMovementEngine airMovementEngine;
    private Drone drone;
    Position position = new Position(1, 2, 3);

    @BeforeEach
    public void setup() {
        airMovementEngine = new AirMovementEngine();
        drone = new Drone(position);
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void testAirMovement(String command, String expectedOutput) {
        airMovementEngine.move(drone, command);
        assertEquals(expectedOutput, drone.getPosition().toString());
    }

    private static Stream<Object[]> provideTestCases() {
        return Stream.of(
                new Object[]{"Up", "[1, 2, 4]"},
                new Object[]{"Down", "[1, 2, 2]"}
                // Add more test cases as needed
        );
    }
}
