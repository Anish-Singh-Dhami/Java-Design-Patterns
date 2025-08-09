package org.anish.patterns.behavioral.strategy;

import org.anish.patterns.behavioral.strategy.flying_strategy.FlyableStrategy;
import org.anish.patterns.behavioral.strategy.talking_strategy.TalkableStrategy;
import org.anish.patterns.behavioral.strategy.walking_strategy.WalkableStrategy;

public abstract class Robot {
    private final FlyableStrategy flyingBehaviour;
    private final WalkableStrategy walkingBehaviour;
    private final TalkableStrategy talkingBehaviour;
    public Robot(FlyableStrategy fly, WalkableStrategy walk, TalkableStrategy talk) {
        flyingBehaviour = fly;
        walkingBehaviour = walk;
        talkingBehaviour = talk;
    }
    void walk() {
        walkingBehaviour.walk();
    }
    void talk() {
        talkingBehaviour.talk();
    }
    void fly() {
        flyingBehaviour.fly();
    }
    abstract public void displayDetails();
}
