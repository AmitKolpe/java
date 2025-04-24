class Circle {
    public int radius;

    // Constructor for Circle
    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double area() {
        return 3.142 * radius * radius; // π * r²
    }
}

class Cylinder extends Circle {
    public int height;

    // Constructor for Cylinder
    public Cylinder(int radius, int height) {
        super(radius); // Call Circle's constructor
        this.height = height;
    }

    // Method to compute volume
    public double volume() {
        return area() * height; // π * r² * h
    }
}

public class inheritance_1 {
    public static void main(String[] args) {
        Circle c = new Circle(5); // radius = 5
        System.out.println("Circle Radius: " + c.getRadius());
        System.out.println("Circle Area: " + c.area());

        Cylinder cyl = new Cylinder(5, 10); // radius = 5, height = 10
        System.out.println("Cylinder Radius: " + cyl.getRadius());
        System.out.println("Cylinder Volume: " + cyl.volume());
    }
}
