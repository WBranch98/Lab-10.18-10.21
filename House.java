package House;

public class House implements Cloneable {
    private Owner owner;  // Change from String to Owner object
    private int size;

    // Constructor taking an Owner object and size
    public House(Owner owner, int size) {
        this.owner = owner;
        this.size = size;
    }

    // Overriding clone method for deep cloning
    @Override
    public House clone() {
        try {
            House clonedHouse = (House) super.clone();
            clonedHouse.owner = this.owner.clone();  // Deep clone the Owner object
            return clonedHouse;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Equals method for comparing House objects
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        House house = (House) o;
        return size == house.size &&
                this.owner.getName().equalsIgnoreCase(house.owner.getName()); // Compare owner names
    }

    // Getter for owner
    public Owner getOwner() {
        return owner;
    }

    // Getter for size
    public int getSize() {
        return size;
    }
}
