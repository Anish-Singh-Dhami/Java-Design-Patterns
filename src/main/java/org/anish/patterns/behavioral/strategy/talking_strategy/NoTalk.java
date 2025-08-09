package org.anish.patterns.behavioral.strategy.talking_strategy;

public class NoTalk implements TalkableStrategy {
    @Override
    public void talk() {
        System.out.println("Cannot Talk!!");
    }
}
