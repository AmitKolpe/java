class Circle {
    public int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
        this.radius = r;
    }

    public double area() {
        return 3.142 * radius * radius;  // Area = π * r²
    }
}

class Cylinder extends Circle {
    public double area_1() {
        return 3.142 * radius;  // This isn't a meaningful geometric area, maybe update this later
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(5);
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Circle Area: " + c.area());

        Cylinder c1 = new Cylinder();
        c1.setRadius(5);
        System.out.println("Cylinder area_1 (placeholder): " + c1.area_1());
    }
}
