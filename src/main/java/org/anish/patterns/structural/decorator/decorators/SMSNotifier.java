package org.anish.patterns.structural.decorator.decorators;

import org.anish.patterns.structural.decorator.notifier.INotifier;

public class SMSNotifier extends BaseNotifier {
    public SMSNotifier(INotifier notifier) {
        super(notifier);
    }

    @Override
    public void sendMessage(final String message) {
        super.notifier.sendMessage(message);
        System.out.println("Sending SMS, subject : " + message);
    }
}
