package org.anish.patterns.behavioral.strategy.walking_strategy;

public class NoWalk implements WalkableStrategy {
    @Override
    public void walk() {
        System.out.println("Cannot Walk!!");
    }
}
