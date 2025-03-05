//Main.java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select a shape:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid");
            System.out.println("7. Exit");
            System.out.println("Enter an option: ");
            int choice = scanner.nextInt();
            
            if (choice == 7) {
                System.out.println("Thanks for Playing.");
                break;
            }

            Shape shape = null;
            
            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    shape = new Circle(radius);
                    break;
                case 2:
                    System.out.print("Enter length: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width: ");
                    double width = scanner.nextDouble();
                    shape = new Rectangle(length, width);
                    break;
                case 3:
                    System.out.print("Enter side: ");
                    double side = scanner.nextDouble();
                    shape = new Square(side);
                    break;
                case 4:
                    System.out.print("Enter radius: ");
                    radius = scanner.nextDouble();
                    shape = new Sphere(radius);
                    break;
                case 5:
                    System.out.print("Enter radius: ");
                    radius = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scanner.nextDouble();
                    shape = new Cylinder(radius, height);
                    break;
                case 6:
                    System.out.print("Enter base length: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    height = scanner.nextDouble();
                    shape = new Pyramid(base, height);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }
            
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println("Volume: " + shape.calculateVolume());
        }
        scanner.close();
    }
}
