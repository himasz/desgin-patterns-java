The SOLID principles are a set of five design principles in object-oriented programming that aim to improve the maintainability, flexibility, and understandability of software. The SOLID acronym stands for:

1. `Single Responsibility Principle (SRP):`
    - A class should have only one reason to change, meaning it should have only one responsibility.
    - Example in Java:

      ```java
      // Before applying SRP
      class Report {
          void generate() {
              // code to generate report
          }
 
          void saveToFile() {
              // code to save report to a file
          }
      }
 
      // After applying SRP
      class Report {
          void generate() {
              // code to generate report
          }
      }
 
      class ReportSaver {
          void saveToFile(Report report) {
              // code to save report to a file
          }
      }
      ```
In the context of the Single Responsibility Principle (SRP), the idea is that a class should have only one reason to change. This principle advocates for dividing a class into smaller, more focused classes, each with a single responsibility. There are several benefits to adhering to SRP and splitting responsibilities:

1. **Improved Maintainability:**
    - When each class has a single responsibility, it becomes easier to understand and maintain. Changes to one aspect of the system are less likely to affect other unrelated parts, reducing the risk of unintended side effects.

2. **Easier Testing:**
    - Classes with a single responsibility are typically easier to test. Unit tests become more straightforward because you can focus on testing specific behaviors without the need to cover unrelated functionality.

3. **Reusability:**
    - Classes with a single responsibility are often more reusable. They can be employed in various contexts without carrying unnecessary baggage from unrelated concerns.

4. **Enhanced Collaboration:**
    - When responsibilities are clearly separated, different developers or teams can work on different parts of the system more independently. This facilitates parallel development and collaboration.

5. **Clearer Code Structure:**
    - A well-structured codebase is easier to navigate and understand. By adhering to SRP, you create a clearer and more organized code structure that aids in readability and reduces cognitive load.

6. **Encapsulation of Change:**
    - Each class encapsulates one specific responsibility, which means that changes related to that responsibility are confined to that class. This encapsulation helps manage and control changes within the codebase.

7. **Adaptability and Flexibility:**
    - With a modular design based on single responsibilities, the system becomes more adaptable to changes. Adding new features or modifying existing ones is less likely to impact other parts of the system, resulting in greater flexibility.

In the "before" example, the `Report` class handles both report generation and saving to a file. If changes are needed in the report generation logic or the way reports are saved, the class is more likely to undergo modifications. In the "after" example, responsibilities are separated, making the code more maintainable and adaptable. If you need to change how reports are saved, you modify the `ReportSaver` class, and the `Report` class remains focused on report generation. This separation of concerns is a key principle in creating maintainable and scalable software systems.

2. `Open/Closed Principle (OCP):`
    - Software entities (e.g., classes, modules, functions) should be open for extension but closed for modification.
    - Example in Java:

      ```java
      // Before applying OCP
      class Circle {
          double radius;
 
          Circle(double radius) {
              this.radius = radius;
          }
      }
 
      class AreaCalculator {
          double calculateArea(Circle circle) {
              return Math.PI * circle.radius * circle.radius;
          }
      }
 
      // After applying OCP
      interface Shape {
          double calculateArea();
      }
 
      class Circle implements Shape {
          double radius;
 
          Circle(double radius) {
              this.radius = radius;
          }
 
          @Override
          public double calculateArea() {
              return Math.PI * radius * radius;
          }
      }
      ```

3. `Liskov Substitution Principle (LSP):`
    - Subtypes must be substitutable for their base types without altering the correctness of the program.
    - Example in Java:

      ```java
      // Before applying LSP
      class Bird {
          void fly() {
              // code for flying
          }
      }
 
      class Penguin extends Bird {
          void fly() {
              // Penguins can't fly, but this method is inherited
          }
      }
 
      // After applying LSP
      interface Flyable {
          void fly();
      }
 
      class Bird implements Flyable {
          @Override
          public void fly() {
              // code for flying
          }
      }
 
      class Penguin implements Swimable {
          void swim() {
              // code for swimming
          }
      }
      ```

4. `Interface Segregation Principle (ISP):`
    - A class should not be forced to implement interfaces it does not use.
    - Example in Java:

      ```java
      // Before applying ISP
      interface Worker {
          void work();
 
          void eat();
      }
 
      class Robot implements Worker {
          @Override
          public void work() {
              // code for working
          }
 
          @Override
          public void eat() {
              // code for eating (unnecessary for a robot)
          }
      }
 
      // After applying ISP
      interface Workable {
          void work();
      }
 
      interface Eatable {
          void eat();
      }
 
      class Robot implements Workable {
          @Override
          public void work() {
              // code for working
          }
      }
      ```

5. `Dependency Inversion Principle (DIP):`
    - High-level modules should not depend on low-level modules; both should depend on abstractions.
    - Abstractions should not depend on details; details should depend on abstractions.
    - Example in Java:

      ```java
      // Before applying DIP
      class LightBulb {
          void turnOn() {
              // code to turn on the light bulb
          }
      }
 
      class Switch {
          LightBulb bulb;
 
          Switch(LightBulb bulb) {
              this.bulb = bulb;
          }
 
          void operate() {
              bulb.turnOn();
          }
      }
 
      // After applying DIP
      interface Switchable {
          void turnOn();
      }
 
      class LightBulb implements Switchable {
          @Override
          public void turnOn() {
              // code to turn on the light bulb
          }
      }
 
      class Switch {
          Switchable device;
 
          Switch(Switchable device) {
              this.device = device;
          }
 
          void operate() {
              device.turnOn();
          }
      }
      ```

These examples demonstrate how to apply each SOLID principle in Java to create more modular, flexible, and maintainable software.