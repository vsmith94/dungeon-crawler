package test;

import static org.junit.jupiter.api.Assertions.*;

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
    public void layerAddLayerWhenThereAreNoLayers(){
        dungeonMap.addObjectToLayer(5, null);
        assertEquals(6, dungeonMap.getLayers().size(), "Amount of layers");
    }

    @Test
    public void layerAddLayerAtIndex1() {
        dungeonMap.addObjectToLayer(2, null); // Total of 3 layers.
        dungeonMap.addObjectToLayer(1, null);
        assertEquals(1 ,dungeonMap.getLayers().get(1).getObjects().getCount(), "Size message");
    }
}