package L11_Interfaces;

import java.util.Objects;

public class RAM extends Component {

    //  variables for internal usage
    private String brand;
    private String type;
    private int capacity;
    private String className = getClass().getSimpleName();

    //  constructor
    public RAM(String brand, String type, int capacity) {
        this.brand = brand;
        this.type = type;
        this.capacity = capacity;
    }

    //  implementation of abstract method getStatus() from abstract class Component
    public void getStatus() {
        System.out.printf("\t%s -> %s %s (%d Gb)\n", className, brand, type, capacity);
        System.out.printf("\t%s -> status is OK\n", className);
    }

    //  overrided methods equals() and hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RAM)) return false;
        RAM ram = (RAM) o;
        return capacity == ram.capacity &&
                brand.equals(ram.brand) &&
                type.equals(ram.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, type, capacity);
    }
}