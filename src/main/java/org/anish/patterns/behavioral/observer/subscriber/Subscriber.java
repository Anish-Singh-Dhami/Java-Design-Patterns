package org.anish.patterns.behavioral.observer.subscriber;

import org.anish.patterns.behavioral.observer.channel.Channel;
import org.anish.patterns.behavioral.observer.channel.IChannel;

public class Subscriber implements ISubscriber {
    private final String name;
    private Channel channel;

    public Subscriber(final String name, final Channel channel) {
        this.name = name;
        this.channel = channel;
    }
    @Override
    public void update() {
        // Subscriber is updated regarding new video
        System.out.println("Hey " + name + ", " + channel.getNewVideo());
    }
}
