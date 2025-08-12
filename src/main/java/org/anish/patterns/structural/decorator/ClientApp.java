package org.anish.patterns.structural.decorator;

import org.anish.patterns.structural.decorator.decorators.EmailNotifier;
import org.anish.patterns.structural.decorator.decorators.SMSNotifier;
import org.anish.patterns.structural.decorator.decorators.SlackNotifier;
import org.anish.patterns.structural.decorator.decorators.WhatsAppNotifier;
import org.anish.patterns.structural.decorator.notifier.INotifier;
import org.anish.patterns.structural.decorator.notifier.Notifier;

public class ClientApp {
    public static void main(String[] args) {
        INotifier notifier = new Notifier();
        // Dummy state :
        final boolean smsEnabled = false;
        final boolean slackEnabled = true;
        final boolean whatsappEnabled = false;
        final boolean emailEnabled = true;
        if(smsEnabled) notifier = new SMSNotifier(notifier);
        if(slackEnabled) notifier = new SlackNotifier(notifier);
        if(whatsappEnabled) notifier = new WhatsAppNotifier(notifier);
        if(emailEnabled) notifier = new EmailNotifier(notifier);

        notifier.sendMessage("First Dummy Message!!");
    }
}
