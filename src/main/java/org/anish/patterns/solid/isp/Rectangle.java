package org.anish.patterns.solid.isp;

public class Rectangle implements Shape2D{
    private final int length, breadth;
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public int area() {
        return length*breadth;
    }
}
