package org.anish.patterns.structural.decorator.decorators;

import org.anish.patterns.structural.decorator.notifier.INotifier;

/***
 * Base Notifier `is-a` INotifier and `has-a` INotifier
 */
public abstract class BaseNotifier implements INotifier {
    final INotifier notifier;
    public BaseNotifier(INotifier notifier) {
        this.notifier = notifier;
    }
}
