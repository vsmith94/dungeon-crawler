package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.game.map.DungeonMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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