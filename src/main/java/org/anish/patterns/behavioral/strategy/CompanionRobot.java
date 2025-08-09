package org.anish.patterns.behavioral.strategy;

import org.anish.patterns.behavioral.strategy.flying_strategy.FlyableStrategy;
import org.anish.patterns.behavioral.strategy.talking_strategy.TalkableStrategy;
import org.anish.patterns.behavioral.strategy.walking_strategy.WalkableStrategy;

public class CompanionRobot extends Robot{

    public CompanionRobot(FlyableStrategy fly, WalkableStrategy walk, TalkableStrategy talk) {
        super(fly, walk, talk);
    }

    @Override
    public void displayDetails() {
        System.out.println("Displaying friendly companion robot features...");
    }
}
