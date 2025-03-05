//Shape.java
abstract class Shape {
    protected String shape;
    
    public Shape(String shape) {
        this.shape = shape;
    }
    
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public abstract double calculateVolume(); 
}
