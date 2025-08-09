package org.anish.patterns.behavioral.strategy.talking_strategy;

public class NormalTalk implements TalkableStrategy {
    @Override
    public void talk() {
        System.out.println("Talking Normally!!");
    }
}
