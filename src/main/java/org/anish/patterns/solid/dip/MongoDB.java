package org.anish.patterns.solid.dip;

// Low Level Module
public class MongoDB implements DataBase {
    @Override
    public void save(String data) {
        System.out.println(data+" Saved in MongoDB");
    }
}
