//Square.java

class Square extends Shape {
    private double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }

    public double calculatePerimeter() {
        return 4 * side;
    }
    
    public double calculateVolume() {
        return 0; 
    }
}
