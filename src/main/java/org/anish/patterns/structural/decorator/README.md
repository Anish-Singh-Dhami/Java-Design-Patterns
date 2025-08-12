### Decorator Design Pattern 
- Allow addition of new functionality at runtime to an existing object,
- All this without changing the core internal structure 
- And without affecting other instances of the same class.
- It follows both **_IS_A_** and **_HAS_A_** relationship
- Useful for extending objects functionality flexibly and adhering to SRP (SOLID)

#### Example:
Consider a notification library, a `Notifier` class which has `send(message)` method that send messages
to a list of emails that were passed to the notifier via its constructor.  
After some time, users of the library expect more than just email notification.
They want SMS, WhatsApp, and Slack notification.  

#### Approach 1:  
Just extend the `Notifier` class and put additional notification methods into new subclasses.  
#### Issue With Approach 1:
What if we want a specialised class which send SMS, Email & Slack, in this way we can have many 
such combination of features leading to class explosion.

#### Approach 2: 
Use Decorator Pattern (Wrapper), by incorporating **Inheritance & Composition** together

#### Applicability:
1. When we need to assign extra behaviours to objects at runtime.
2. When use of inheritance is not possible to extend an object's behaviour.