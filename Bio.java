package Age;

public class Bio {
    private int age;

    public void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Invalid age: " + age + ". Age must be between 0 and 150.");
        } else {
            this.age = age;
            System.out.println("Age is valid: " + age);
        }
    }

    public int getAge() {
        return age;
    }
}

