/*
- An object is the runtime instance of a class - has state, behaviour, and identity.
- Created using the 'new' keyword -> allocates memory in the heap, refrence variable store on the stack.
- Multiple refrence varibles can point to the same object (aliasing).
- "equals()" vs "==" -> "==" compares refrence (memory address), "equals() comparer content or value (if overridded)".
- hashCode() => use by hash based collections (Hash Map, Hash Set), contract: equal object must have equal hashcode.
- toString() => overide to get meaningful string representation instead of 'ClassName@hashcode'.
- object are garbabe collected when no refernce points to them(unreachable).

Interview Traps :
    - Overriding equals() without hascode() breaks hashmap / hashset behaviour.
    - Object creation ways : new(), reflection, clone(), deserelization.
 */

import java.util.Objects;

public class ObjectDemo {

    private String brand;
    private String model;
    private int year;

    public ObjectDemo(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Overriding toString() for meaningful printing
    @Override
    public String toString() {
        return year + " " + brand + " " + model;
    }

    // Overriding equals() for logical comparison
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObjectDemo other = (ObjectDemo) obj;
        return year == other.year && brand.equals(other.brand) && model.equals(other.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year);
    }

    public static void main(String[] args) {
        ObjectDemo car1 = new ObjectDemo("Toyota", "Camry", 2023);
        ObjectDemo car2 = new ObjectDemo("Toyota", "Camry", 2023);
        ObjectDemo car3 = car1; // reference copy (aliasing) — same object

        System.out.println(car1);                     // uses toString()
        System.out.println("car1 == car2: " + (car1 == car2));           // false (different objects)
        System.out.println("car1 == car3: " + (car1 == car3));           // true (same reference)
        System.out.println("car1.equals(car2): " + car1.equals(car2));   // true (same content)
        System.out.println("car1.hashCode(): " + car1.hashCode());
        System.out.println("car2.hashCode(): " + car2.hashCode());       // equal since equals() true

        // Object array — multiple independent objects
        ObjectDemo[] fleet = {
            new ObjectDemo("Honda", "Civic", 2022),
            new ObjectDemo("Ford", "Mustang", 2024)
        };
        for (ObjectDemo car : fleet) {
            System.out.println(car);
        }

        // Eligible for garbage collection once dereferenced
        car1 = null;
        car3 = null; // now original Camry object has no references left
    }
}
