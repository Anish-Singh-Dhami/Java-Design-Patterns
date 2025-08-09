package org.anish.patterns.behavioral.strategy.walking_strategy;

public class NormalWalk implements WalkableStrategy{
    @Override
    public void walk() {
        System.out.println("Walking Normally!!");
    }
}
