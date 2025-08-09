package org.anish.patterns.behavioral.observer.channel;

import org.anish.patterns.behavioral.observer.subscriber.ISubscriber;

public interface IChannel {
    void subscribe(ISubscriber subscriber);
    void unsubscribe(ISubscriber subscriber);
    void notifySubscribers();
}
