import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RoadTest {
    Road road = new Road("0", 1, 5, new int[]{0, 0});

    @Test
    void getId() {
        assertEquals("road_0", road.getId());
    }

    @Test
    void getSpeedLimit() {
        assertEquals(1, road.getSpeedLimit());
    }

    @Test
    void getLength() {
        assertEquals(5, road.getLength());
    }

    @Test
    void getStartLocation() {
        int[] expected = {0, 0};
        assertArrayEquals(expected, road.getStartLocation());
    }

    @Test
    void getEndLocation() {
        int[] expected = {5, 0};
        assertArrayEquals(expected, road.getEndLocation());
    }

    @Test
    void getCars() {
        ArrayList<Car> expected = new ArrayList<>();
        assertEquals(expected, road.getCarsOnRoad());
    }

    @Test
    void getLights() {
        ArrayList<TrafficLight> expected = new ArrayList<>();
        assertEquals(expected, road.getLightsOnRoad());
    }

    @Test
    void getConnectedRoads() {
        ArrayList<Road> expected = new ArrayList<>();
        assertEquals(expected, road.getConnectedRoads());
    }
}