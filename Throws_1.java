// Custom exception class
class NegativeRadiusException extends Exception {
    public String toString() {
        return "Radius cannot be negative.";
    }

    public String getMessage() {
        return "Negative radius exception was found.";
    }
}

// Main class
class Throws_1 {

    // Method to calculate area
    public static double area(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }

    // Main method
    public static void main(String[] args) {
        try {
            double ans = area(-5); // Example with negative radius
            System.out.println("Area: " + ans);
        } catch (NegativeRadiusException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }
}
