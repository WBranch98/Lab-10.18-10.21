package House;

public class HouseTester {

    public static void main(String[] args) {
        // Create an Owner object
        Owner owner1 = new Owner("Alice");

        // Create a House object with size and owner
        House house1 = new House(owner1, 1200);

        // Clone the House object (deep cloning)
        House house2 = house1.clone();

        // Output before modification
        System.out.println("Before modifying owner:");
        System.out.println("House1 owner: " + house1.getOwner().getName());
        System.out.println("House2 owner: " + house2.getOwner().getName());

        // Modify the owner name of the cloned object
        house2.getOwner().clone().getName().replace("Alice", "Bob");

        // Output after modification
        System.out.println("\nAfter modifying owner:");
        System.out.println("House1 owner: " + house1.getOwner().getName());
        System.out.println("House2 owner: " + house2.getOwner().getName());

        // Testing equality of the two House objects
        System.out.println("\nAre house1 and house2 equal? " + house1.equals(house2));
    }
}
