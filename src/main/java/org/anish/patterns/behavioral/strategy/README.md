### Strategy Design Pattern
- Defines a family of Algorithms, put them into  separate classes so that they can be changed at run time.
- Provides users a way to change the behaviour of a class without extending it.
- Favours composition over inheritance.
- Encapsulate what varies & keep them separate form those which remains same
- Example: There can exist multiple payment strategies, which a user can choose at run time like pay through card, through UPI, or COD.
- Thus, our payment client will have a payment strategy object (composition) 
