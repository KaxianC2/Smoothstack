package day4;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LineTest {
    public Line t1 = new Line(3, 2, 4, 1);
    public Line t2 = new Line(3, 2, 7, 10);
    public Line t3 = new Line(1, 1, 3, 2);
    public Line t4 = new Line(0, 1, 0, 2);
    
    @Test
    void slopeEqual() {
        assertEquals(t1.getSlope(), -1);
        assertEquals(t2.getSlope(), 2);
        assertEquals(t3.getSlope(), 0.5, 0.0001);
    }
    
    @Test
    void slopeNotEqual() {
        assertNotEquals(t1.getSlope(), 1);
        assertNotEquals(t2.getSlope(), -1);
        assertNotEquals(t3.getSlope(), 5);
    }
    
    @Test
    void slopeExcept() {
        assertThrows(ArithmeticException.class, ()->{t4.getSlope();});
    }
    
    @Test
    void getDistanceEqual() {
        assertEquals(t4.getDistance(), 1);
        assertEquals(t2.getDistance(), 8.944272,.0001);
    }
    
    @Test
    void getDistanceNotEqual() {
        assertNotEquals(t4.getDistance(), 5);
        assertNotEquals(t2.getDistance(), 3.1415,.0001);
    }
    
    @Test
    void ParallelEqual() {
        assertTrue(t3.parallelTo(new Line(0,0,2,1)));
    }
    
    @Test
    void ParallelNotEqual() {
        assertFalse(t3.parallelTo(t2));
    }
    

}