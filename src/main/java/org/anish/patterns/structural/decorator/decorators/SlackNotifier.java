package org.anish.patterns.structural.decorator.decorators;

import org.anish.patterns.structural.decorator.notifier.INotifier;

public class SlackNotifier extends BaseNotifier {
    public SlackNotifier(INotifier notifier) {
        super(notifier);
    }

    @Override
    public void sendMessage(final String message) {
        super.notifier.sendMessage(message);
        System.out.println("Sending Slack alert, subject : " + message);
    }
}
