package test;

import com.game.map.DungeonMap;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestClass {
    DungeonMap dungeonMap;

    @BeforeEach
    public void initializer() {
        dungeonMap = new DungeonMap();
    }

    @Test
    public void layerTest() {
        assertTrue(true);
    }
}