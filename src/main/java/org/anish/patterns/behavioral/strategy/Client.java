package org.anish.patterns.behavioral.strategy;

import org.anish.patterns.behavioral.strategy.flying_strategy.NoFly;
import org.anish.patterns.behavioral.strategy.flying_strategy.NormalFly;
import org.anish.patterns.behavioral.strategy.talking_strategy.NoTalk;
import org.anish.patterns.behavioral.strategy.talking_strategy.NormalTalk;
import org.anish.patterns.behavioral.strategy.walking_strategy.NoWalk;
import org.anish.patterns.behavioral.strategy.walking_strategy.NormalWalk;

public class Client {
    public static void main(String[] args) {
        Robot robot1 = new CompanionRobot(new NoFly(), new NormalWalk(), new NormalTalk());
        robot1.walk();
        robot1.talk();
        robot1.fly();
        robot1.displayDetails();

        Robot robot2 = new WorkerRobot(new NormalFly(), new NoWalk(), new NoTalk());
        robot2.walk();
        robot2.talk();
        robot2.fly();
        robot2.displayDetails();
    }
}
