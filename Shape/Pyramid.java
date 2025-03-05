//Pyramid.java

class Pyramid extends Shape {
    private double base, height;

    public Pyramid(double base, double height) {
        super("Equilateral Pyramid");
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        double slantHeight = Math.sqrt((base / 2) * (base / 2) + height * height);
        return base * base + 2 * base * slantHeight;
    }

    public double calculatePerimeter() {
        return 4 * base;
    }

    public double calculateVolume() {
        return (1.0 / 3.0) * base * base * height;
    }
}
