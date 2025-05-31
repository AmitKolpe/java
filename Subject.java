public class Subject {
    private String name;
    private String code;
    private int credits;

    public Subject(String name, String code, int credits) {
        this.name = name;
        this.code = code;
        this.credits = credits;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getCredits() {
        return credits;
    }

    // Display method
    public void displayInfo() {
        System.out.println("Subject Name: " + name);
        System.out.println("Subject Code: " + code);
        System.out.println("Credits: " + credits);
    }
}

// Sample usage
public class Main {
    public static void main(String[] args) {
        Subject math = new Subject("Mathematics", "MTH101", 4);
        math.displayInfo();
    }
}
