package org.anish.patterns.behavioral.strategy.flying_strategy;

public class NoFly implements FlyableStrategy {
    @Override
    public void fly() {
        System.out.println("Cannot Fly!!");
    }
}
