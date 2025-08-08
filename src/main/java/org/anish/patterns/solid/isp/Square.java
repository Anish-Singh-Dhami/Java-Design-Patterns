package org.anish.patterns.solid.isp;

public class Square implements Shape2D{
    private final int side;
    public Square(int side) {
        this.side = side;
    }
    @Override
    public int area() {
        return side*side;
    }
}
