package org.anish.patterns.structural.decorator.notifier;

// Common interface for Notifier and all other types of notification decorators.
public abstract interface INotifier {
    void sendMessage(final String message);
}
