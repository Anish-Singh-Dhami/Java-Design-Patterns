### Liskov Substitution Principle
- Subclasses should be substitutable for their base class.
- i.e, for those places where we're expecting a base class reference, passing its child class reference shouldn't break 
the code
- Implies inheritance shouldn't narrow down the capabilities of the parent class.

#### Guidelines to follow: 
- Signature Rule
  1. **Method Argument Rule** => Argument of child class's method should be similar or broaden(parent of argument object) up respective to the argument of the parent class's method.                    
  2. **Return Type Rule** => Return type of child class's method should be similar or narrow(child of return type object) down respective to the return type of the parent class's method.
  3. **Exception Rule** => Exception thrown by child class's method should be similar or narrow down respective to the exception thrown by the parent class's method.
- **Property Rule**
  1. **Class Invariant** => A invariant set / followed in the parent class should either be maintained or strengthen by the child class, and shouldn't weaken it.
  2. **History Constraint** => A property like a method should always be used set by the parent class then child class have to follow it. Or access modifier shouldn't decrease the visibility.(ex public, private, or final)
- **Method Rule**
  1. **Pre-Condition** => condition set prior to the execution of method.
  2. **Post-Condition** => condition to be metho after the execution of method.