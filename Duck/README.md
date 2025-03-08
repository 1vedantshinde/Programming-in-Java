## Explanation

> Problem: 1) Write an application to show the behavior of a Duck.
>> 2) Also create a new Behaviour :
               a) <<interface>> SwimBehavior and FlyBehaviour
               b) Three different classes  Swim, Float, and Drown which implement SwimBehavior containing swim() method and Fly, NotFly which implements FlyBehaviour containing fly() method.    
>> 3) Print which duck will fly, float or swim. Implement all ducks in diagram.
>> 4) Create a class diagram for entire program (including swim interface). Use IntelliJ professional edition.


### Main.java
The Main class serves as the entry point for the program, demonstrating the behavior of different types of ducks using the Strategy Pattern.
Key Functions:
1. Creates different duck objects (MallardDuck, RubberDuck, RedheadDuck).
2. Calls their display() method to print the duck type.
3. Performs different behaviors (performQuack(), performFly(), performSwim()) based on their assigned strategies.
4. Prints separators (--------------------------) to distinguish outputs for each duck.
5. Encounters an error for RedheadDuck due to an incorrect constructor (now fixed).

This setup shows polymorphism and dynamic behavior assignment, making it easy to modify duck behaviors without changing the core code.

---

### 1. MallardDuck.java  
- **Extends** `Duck`, meaning it inherits the base structure.  
- **Constructor initializes behaviors**:  
  - Uses `Quack()` (real duck sound).  
  - Uses `Fly()` (flies normally).  
  - Uses `SwimWithLegs()` (swims naturally).  
- **`display()` method**: Prints `"I am a Mallard Duck."`  


---

### 2. RedheadDuck.java  
- **Extends** `Duck`, like `MallardDuck`.  
- **Constructor initializes behaviors** (once fixed!):  
  - Uses `Quack()` (real quack).  
  - Uses `Fly()` (flies naturally).  
  - Uses `SwimWithLegs()` (swims naturally).  
- **`display()` method**: Prints `"I am a Redhead Duck."`  


---

### 3. RubberDuck.java  
- **Extends** `Duck`.  
- **Constructor initializes behaviors**:  
  - Uses `Squeak()` (squeaky toy sound instead of quack).  
  - Uses `NoFly()` (cannot fly).  
  - Uses `Floating()` (does not swim like real ducks).  
- **`display()` method**: Prints `"I am a rubber duck."`


### 4. QuackBehaviour.java  
- Interface defining `quack()`.  
- Implementations:  
  - **`Quack`** → `"QUACK!"` (real ducks).  
  - **`Squeak`** → `"Squeakkkkk!"` (rubber ducks).
  - 
---

### 5. FlyBehaviour.java  
- Interface defining `fly()`.  
- Implementations:  
  - **`FlyWithWings`** → `"I can fly."` (real ducks).  
  - **`NoFly`** → `"I can't fly."` (rubber ducks).  

---

### 6. SwimBehaviour.java  
- Interface defining `swim()`.  
- Implementations:  
  - **`SwimWithLegs`** → `"I swim with my legs."` (real ducks).  
  - **`Floating`** → `"I float on water."` (rubber ducks).  

---


### Summary

### Summary Table  

| Component           | Description |
|--------------------|-------------|
| **Main.java** | Entry point of the program. Creates different ducks and calls their behaviors (display, quack, fly, swim). Demonstrates polymorphism and dynamic behavior assignment. |
| **MallardDuck.java** | Extends `Duck`. Uses `Quack()`, `Fly()`, and `SwimWithLegs()`. Represents a real mallard duck. |
| **RedheadDuck.java** | Extends `Duck`. Uses `Quack()`, `Fly()`, and `SwimWithLegs()`. Represents a real redhead duck. |
| **RubberDuck.java** | Extends `Duck`. Uses `Squeak()`, `NoFly()`, and `Floating()`. Represents a toy duck. |
| **QuackBehaviour.java** | Interface for `quack()`. Implementations: `Quack` (real ducks), `Squeak` (rubber ducks). |
| **FlyBehaviour.java** | Interface for `fly()`. Implementations: `Fly` (real ducks), `NoFly` (rubber ducks). |
| **SwimBehaviour.java** | Interface for `swim()`. Implementations: `SwimWithLegs` (real ducks), `Floating` (rubber ducks). |


