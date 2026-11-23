# Lesson 6: Polymorphism and Abstraction

## The Lost and Found Department of the Mind

*A department responsible for recovering things that were never physically lost.*

This activity contains two Java programs demonstrating polymorphism and abstraction using a fictional department that recovers fragments of the mind, such as forgotten memories, unanswered questions, and dreams.

I chose this concept because not everything we lose is something we can physically hold or find. Some things remain in our thoughts, and not everything we remember or recover comes back in the same way.

---

## Part 1 – Polymorphism

### `PolymorphismDemo.java`

The first program simulates the recovery of different fragments of the mind. It has two types of fragments: a forgotten memory and an unanswered question. Both can be recovered, but they produce different results.

The program uses `LostFragment` as the parent class, while `ForgottenMemory` and `UnansweredQuestion` are its child classes. Both child classes override the `recover()` method to provide their own behavior.

### How polymorphism works in my program

I used `LostFragment` as the reference type for objects belonging to different child classes. Even though both objects are declared using the same parent class, calling their `recover()` method produces different results.

This allows the program to handle different types of fragments using the same method without needing to create an entirely different method for each one.

- **Parent class:** `LostFragment`
- **Child classes:** `ForgottenMemory` and `UnansweredQuestion`
- **Overridden method:** `recover()`

---

## Part 2 – Abstraction

### `AbstractionDemo.java`

The second program represents the department's process of recording recovered fragments. Each fragment has a name and recovery details, but the actual description of how it was recovered depends on its type.

I used an abstract class called `RecoveredFragment` to provide a common structure for the fragments. It contains an abstract method called `describeRecovery()` and a regular method called `displayRecord()`.

The child classes `MemoryFragment` and `DreamFragment` implement `describeRecovery()` differently, while both can use the inherited `displayRecord()` method.

### How abstraction works in my program

The abstract class provides a structure that the child classes must follow without defining every detail of their behavior. The `describeRecovery()` method is left for the child classes to implement, while `displayRecord()` already has its own implementation.

This allows the program to share common features without requiring every class to repeat the same code.

- **Abstract class:** `RecoveredFragment`
- **Abstract method:** `describeRecovery()`
- **Concrete method:** `displayRecord()`
- **Child classes:** `MemoryFragment` and `DreamFragment`

---

## Difference Between Polymorphism and Abstraction

For me, the difference between the two is how they are used in organizing a program.

Polymorphism allows different objects to respond differently even when the same method is called. In my first program, both forgotten memories and unanswered questions use `recover()`, but each produces a different result.

Abstraction, on the other hand, allows me to create a general structure without having to define every detail immediately. In my second program, `RecoveredFragment` establishes the methods that recovered fragments should have, while the child classes provide their own recovery descriptions.

They can be used together, but they serve different purposes. Abstraction helps establish a structure, while polymorphism allows objects following that structure to behave differently.

---

## Reflection Questions

### 1. Why is method overriding important in polymorphism? What happens if a child class does not override the parent's method?

Method overriding is important because it allows a child class to have its own behavior instead of simply following what the parent class already does. In my program, the two fragments have different recovery results even though they share the same method name.

If a child class does not override the method, it will use the parent's version instead, as long as that method is accessible and not otherwise restricted. This means it will perform the parent's behavior rather than its own specific behavior.

### 2. Why can't we create an object directly from an abstract class? What is the purpose of this restriction?

An abstract class is meant to serve as a foundation for other classes rather than as a complete object on its own. It can contain methods that still need to be implemented, so creating an object directly from it would not make sense.

The restriction encourages us to create child classes that complete the missing methods before their objects are used. It also helps establish a consistent structure among related classes.

### 3. If you need to add another child class to your polymorphism program, how would your existing code handle it?

I could create another class that extends `LostFragment` and overrides the `recover()` method according to what that new fragment represents. For example, I could add `ForgottenDream` and give it its own recovery message.

The new class could still be treated as a `LostFragment`, so it would work with the same parent-class reference. This means I could add more types of fragments without having to completely change the existing structure of my program.

### 4. Can polymorphism and abstraction work together in a single program? Explain how and provide an example.

Yes, they can work together in one program. An abstract class can establish a common method that its child classes must implement, and polymorphism can allow those child objects to be handled through the same parent reference.

For example, I could create an abstract class called `Fragment` with an abstract method `recover()`. Then, `MemoryFragment` and `DreamFragment` could extend it and implement `recover()` differently. I could store both objects in a `Fragment` reference and call `recover()`, allowing each object to perform its own behavior.

### 5. As a future programmer, when would you use polymorphism, and when would you use abstraction?

I would use polymorphism when I have different types of objects that share the same general action but need to perform it differently. It would be useful when a program grows and I need to add more types without constantly rewriting the same process for each one.

I would use abstraction when I want to establish a common structure for related classes and define what they should be able to do without having to provide every implementation in one place. It would help me keep my code organized and avoid unnecessary repetition.

I think both are useful when creating programs that are easier to maintain and expand, especially when I know that more features or types of objects may be added in the future.

---

## Conclusion

Through this activity, I was able to understand how polymorphism and abstraction can be used to organize related classes while allowing them to have different behaviors. Although they are both connected to inheritance and are sometimes used together, they have different purposes.

Polymorphism allows objects to behave differently through the same method, while abstraction provides a structure that hides unnecessary details and allows child classes to complete certain behaviors.

This activity also helped me see how these concepts can be applied to scenarios beyond the usual examples, even in something as abstract as a fictional department that recovers fragments of the mind.