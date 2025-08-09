package org.anish.patterns.behavioral.observer;

import org.anish.patterns.behavioral.observer.channel.Channel;
import org.anish.patterns.behavioral.observer.subscriber.Subscriber;

public class Client {
    public static void main(String[] args) {
        Channel channel = new Channel("CodeWithUrBoi!");

        Subscriber sub1 = new Subscriber("Alice", channel);
        Subscriber sub2 = new Subscriber("Bob", channel);

        channel.uploadVideo("First Video");

        channel.subscribe(sub1);
        channel.subscribe(sub2);
        channel.uploadVideo("Observer Design Pattern Tutorial");

        channel.unsubscribe(sub1);
        channel.uploadVideo("Factory Design Pattern Tutorial");
    }
}
