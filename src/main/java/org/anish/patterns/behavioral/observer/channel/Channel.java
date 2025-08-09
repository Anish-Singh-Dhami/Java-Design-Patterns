package org.anish.patterns.behavioral.observer.channel;

import org.anish.patterns.behavioral.observer.subscriber.ISubscriber;

import java.util.ArrayList;

public class Channel implements IChannel {
    private final String name;
    private String latestVideo; // Observing for latest video
    ArrayList<ISubscriber> subscribers;

    public Channel(String name) {
        subscribers = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void subscribe(ISubscriber subscriber) {
        if(!subscribers.contains(subscriber)) {
            subscribers.add(subscriber);
        }
    }

    @Override
    public void unsubscribe(ISubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for(ISubscriber subscriber: subscribers) {
            subscriber.update();
        }
    }

    // Uploads new video and notify all subscribers
    public void uploadVideo(final String title) {
        latestVideo = title;
        System.out.println(name + " has uploaded new video: \""+title+"\"");
        notifySubscribers();
    }

    public String getNewVideo() {
        return "Checkout our new Video : " + latestVideo + "\n";
    }
}
