package org.oop;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getDistanceFrom(Point other) {
        double xDistance = x - other.x;
        double yDistance = y - other.y;
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public double getDirectionTo(Point other) {
        double xDistance = other.x - x;
        double yDistance = other.y - y;
        return Math.atan2(yDistance, xDistance);
    }
}
