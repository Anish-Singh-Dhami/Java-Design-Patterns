package org.anish.patterns.structural.decorator.decorators;

import org.anish.patterns.structural.decorator.notifier.INotifier;

public class EmailNotifier extends BaseNotifier {
    public EmailNotifier(INotifier notifier) {
        super(notifier);
    }

    @Override
    public void sendMessage(final String message) {
        super.notifier.sendMessage(message);
        System.out.println("Sending Email, subject : " + message);
    }
}
