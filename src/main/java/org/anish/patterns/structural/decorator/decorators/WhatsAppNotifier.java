package org.anish.patterns.structural.decorator.decorators;

import org.anish.patterns.structural.decorator.notifier.INotifier;

public class WhatsAppNotifier extends BaseNotifier {
    public WhatsAppNotifier(INotifier notifier) {
        super(notifier);
    }

    @Override
    public void sendMessage(String message) {
        super.notifier.sendMessage(message);
        System.out.println("Sending WhatsApp message, subject : " + message);
    }
}
