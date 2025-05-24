import java.util.Scanner;

class Village {
    String name;
    String description;
    double distanceFromCity; // in kilometers

    Village(String name, String description, double distanceFromCity) {
        this.name = name;
        this.description = description;
        this.distanceFromCity = distanceFromCity;
    }

    void displayInfo() {
        System.out.println("\n--- Village Info ---");
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Distance from City: " + distanceFromCity + " km");
    }
}

public class VillageDestinationFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Village[] villages = {
            new Village("Rampur", "A peaceful village surrounded by greenery.", 30.5),
            new Village("Lakshmipur", "Famous for its temples and festivals.", 45.2),
            new Village("Devgaon", "Known for its scenic river and mango orchards.", 60.0),
            new Village("Basantpur", "A modernizing village with schools and hospitals.", 25.8)
        };

        System.out.println("Welcome to the Village Destination Finder!");
        System.out.println("Choose a village to explore:");

        for (int i = 0; i < villages.length; i++) {
            System.out.println((i + 1) + ". " + villages[i].name);
        }

        System.out.print("\nEnter your choice (1-" + villages.length + "): ");
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= villages.length) {
            villages[choice - 1].displayInfo();
        } else {
            System.out.println("Invalid choice. Please run the program again.");
        }

        scanner.close();
    }
}
