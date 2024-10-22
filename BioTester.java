package Age;

public class BioTester {
    public static void main(String[] args) {
        Bio bio = new Bio();

        try {
            bio.checkAge(25);  // Valid age
            bio.checkAge(200); // Invalid age, should throw exception
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        try {
            bio.checkAge(-5);  // Invalid age, should throw exception
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
