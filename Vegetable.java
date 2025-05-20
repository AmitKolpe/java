public class Vegetable {
    private String name;
    private String color;
    private double weight; // in grams

    // Constructor
    public Vegetable(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // toString method
    @Override
    public String toString() {
        return "Vegetable{name='" + name + "', color='" + color + "', weight=" + weight + "g}";
    }

    // Main method for testing
    public static void main(String[] args) {
        Vegetable carrot = new Vegetable("Carrot", "Orange", 150);
        System.out.println(carrot);

        Vegetable spinach = new Vegetable("Spinach", "Green", 80);
        System.out.println(spinach);
    }
}
