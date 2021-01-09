import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MotorbikeTest {
    Motorbike bike = new Motorbike("0");

    @Test
    void getLength() {
        assertEquals(0.5, bike.getLength());
    }

    @Test
    void getId() {
        assertEquals("bike_0", bike.getId());
    }

    @Test
    void testInheritance() {
        assertEquals(0, bike.getSpeed());
        assertEquals(1, bike.getPosition());
    }
}