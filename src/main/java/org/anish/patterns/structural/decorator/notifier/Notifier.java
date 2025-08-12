package org.anish.patterns.structural.decorator.notifier;

public class Notifier implements INotifier {
    @Override
    public void sendMessage(String message) {
        System.out.println("Message Received : " + message);
    }
}
