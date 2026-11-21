Lesson 6: Polymorphism and Abstraction

This activity demonstrates two important Object-Oriented Programming (OOP) concepts: Polymorphism and Abstraction.
Both concepts are implemented using Java through real-world scenarios.



1. POLYMORPHISM

PolymorphismDemo.java - This program demonstrates polymorphism through a simple delivery system. It has one parent class named "DeliveryVehicle" and two child classes named "Motorcycle" and "DeliveryVan"

Both child inherit from the parent class using the "extends" keyword.

Polymorphism is demonstrated through method overriding. The parent class contains a method called "deliver()", which is overridden by both child classes.

The "Motorcycle" class provides an implements a delivery with small packages on narrow roads, while the "DeliveryVan" allows delivery of multiple packages.

In the main method, a parent-class reference named "DeliveryVehicle" is used to hold different child  objects. Although the same reference variable calls "deliver()", the output changes depending on which child object is assigned to it.



2. Abstraction

AbstractionDemo.java - This program demonstrates abstraction through an appliance system. It contains  an abstract parent class named "Appliance" and two child classes named "ElectricFan" and "AirConditioner".

The "Appliance" class contains an abstract method named "operate()" and a concrete method named "showBrand()".

The abstract method does not contain an implementation in the parent class provides its own version of the method.

The "ElectricFan" class implements "operate()" by displaying that the fan is rotating, while the "AirConditioner" class implements it by displaying that the air conditioner is cooliing the room.

Meanwhile, both child classes inherit the "showBrand()" method from the parent class.

This allows the program to establish common feature while letting each appliance define how it operates.



3. Difference Between Polymorphism and Abstraction

Polymorphism focuses on allowing the same method or instruction to produce different behaviors depending on the object using it.

Abstraction focuses on establishing a general structure while hiding implementation details that do not need to be exposed.

In my programs, polymorphism is demonstrated when the same "deliver()" method produces different outputs for Motorcycle and Delivery van.
On the other hand, abstraction is demonstrated when the "Appliance" class requires its child classes to implement "operate()" without defining exactly how each appliance work.

Polymorphism focuses on different behaviors, while abstraction focuses on defining what must be implemented without specifying every detail.




-------- REFLECTION QUESTIONS -------


1. Why is method overriding important in polymorphism? What happens if a child class does not override the parent's method?

Method overriding allows a child class to provide its own behavior for a method inherited from its parent. Without overriding, the child class will simply use the parent's existing implementation. This means that the behavior will remain the same unless another implementation is provided.


2. Why can't we create an object directly from an abstract class? What is the purpose of this restriction?

An abstract class is incomplete because it may contain methods that do not yet have an implementation. Creating an object directly from it would mean creating an instance without defining how its abstract methods should work. This restriction ensures that concrete child classes provide the required implementations.


3. If you need to add another child class to your polymorphism program, how would your existing code handle it?

I can create another class that extends "Notification" and overrides "sendNotification()`". The existing parent class and its other child classes do not need to be changed. I can simply create an object of the new class and assign it to a "Notification" reference to execute its behavior.


4. Can polymorphism and abstraction work together in a single program? Explain how and provide an example.

Yes. They can work together because abstraction can establish the common structure, while polymorphism allows different child classes to provide different implementations.

For example, an abstract "Payment" class could contain an abstract method called "processPayment()". Child classes such as "CashPayment" and "CardPayment" could implement the method differently. A parent-class reference could then call "processPayment()" on either object, demonstrating both abstraction and polymorphism.


5. As a future programmer, when would you use polymorphism, and when would you use abstraction?

I would use polymorphism when I need different objects to perform the same action in different ways. This would be useful in systems involving notifications, payments, or different types of users.

I would use abstraction when I want to create a common structure for related classes while leaving specific details for each child class to implement. This would help keep my code organized and prevent unnecessary repetition.

Both concepts are useful because they make programs easier to organize, maintain, and expand as new features are added.