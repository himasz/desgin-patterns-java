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