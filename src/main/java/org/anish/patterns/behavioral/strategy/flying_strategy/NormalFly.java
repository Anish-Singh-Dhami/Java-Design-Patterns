package org.anish.patterns.behavioral.strategy.flying_strategy;

public class NormalFly implements FlyableStrategy {
    @Override
    public void fly() {
        System.out.println("Flying Normally!!");
    }
}
