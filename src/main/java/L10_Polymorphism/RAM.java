package L10_Polymorphism;

import java.util.Objects;

public class RAM  extends Component {

    private String brand;
    private String type;
    private String capacity;

    //  constructor
    public RAM(String brand, String type, String capacity) {
        this.brand = brand;
        this.type = type;
        this.capacity = capacity;
    }

    //  method used in SystemUnit class
    @Override
    public void getStatus() {
        System.out.printf("\t%s -> %s %s (%s Gb)\n", getClass().getSimpleName(), brand, type, capacity);
        super.getStatus();
    }

    //  overrided methods equals() and hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RAM)) return false;
        RAM ram = (RAM) o;
        return brand.equals(ram.brand) &&
                type.equals(ram.type) &&
                capacity.equals(ram.capacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, type, capacity);
    }
}