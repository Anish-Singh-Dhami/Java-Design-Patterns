package org.anish.patterns.solid.isp;

public class Cube implements Shape3D{
    private final int side;
    public Cube(int side) {
        this.side = side;
    }
    @Override
    public int area() {
        return side*side;
    }

    @Override
    public int volume() {
        return side*side*side;
    }
}
