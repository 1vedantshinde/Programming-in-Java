## Explanation

> Write Menu Driven program to calculate the Area and Volume of the selected Shape
 a) Create classes as Circle, Rectangle, Square, Sphere, Cylinder, and Equilateral Pyramid (Square Base).
 b) Create Shape as abstract class with Shape(String shape) as non-abstract method,
       while calculateShape() and calculatePerimeter() as abstract method.
 c) Create Volume as an interface with calculateVolume() as an abstract method.
 d) Get input from users for measurements of shapes.



### Main
The `Main.java` class acts as the front-end for the Shape program and displys the options for the shapes the user can choose from to compute and display their perimenter, volume and area. The following are the shapes that can be chosen:
1. Circle
2. Rectangle
3. Square
4. Sphere
5. Cylinder
6. Equilateral Pyramid.

Lastly, the user can choose the option of exiting the program.
Here, switch-case is applied to check the input of the user and for calling the relevant class.


### Shape 
The `Shape.java` class serves as the foundation for all geometric shapes in the program. It defines an abstract class that enforces a common structure across different shape implementations. Each shape that extends Shape must implement the `calculateArea()`, `calculatePerimeter()`, and `calculateVolume()` methods, ensuring consistent behavior across all shape types. This abstraction allows for seamless integration and expansion of new shapes while maintaining a uniform interface.

Additionally, `Shape` includes a constructor that initializes essential properties of a shape, such as its dimensions. This allows subclasses to inherit a common structure while implementing their own logic for calculations. By enforcing this uniform interface, `Shape.java` ensures consistency across all shape types and allows new shapes to be added without modifying the core program logic.


### Circle
The Circle.java class represents a two-dimensional circle and extends the Shape class. It takes the radius as input and implements methods to compute its area and perimeter.

The calculateArea() method uses the formula:
A = pi * r^2
where r is the radius of the circle.

The calculatePerimeter() method computes the circumference using:
P = 2 * pi * r

Since a circle is a two-dimensional shape, the calculateVolume() method returns 0 as volume is not applicable.


### Rectangle
The `Rectangle.java` class represents a two-dimensional rectangle and extends the `Shape` class. It takes the length and width as input and provides methods to compute its area and perimeter.

The `calculateArea()` method calculates the area using:
A = length * width

The `calculatePerimeter()` method computes the perimeter using:
P = 2 * (length + width)

Since a rectangle is a two-dimensional shape, the `calculateVolume()` method returns 0, as volume is not applicable.



### Square

### Sphere

### Cylinder

### Pyramid

