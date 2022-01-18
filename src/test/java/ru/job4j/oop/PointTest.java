package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void testDistance1() {
        double expected = 2.0;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void testDistance2() {
        double expected = 1.0;
        Point a = new Point(0, 1);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void testDistance3d() {
        double expected = 2.82;
        Point a = new Point(0, 0, 1);
        Point b = new Point(0, 2, 3);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void testDistance3d2() {
        double expected = 3.61;
        Point a = new Point(0, 5, 1);
        Point b = new Point(0, 2, 3);
        double dist = a.distance3d(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
}