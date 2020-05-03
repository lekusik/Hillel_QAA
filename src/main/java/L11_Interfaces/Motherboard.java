package L11_Interfaces;

import java.util.Objects;

public class Motherboard extends Component {

    //  variables for internal usage
    private String brand;
    private String model;
    private int ramSlots;
    private String className = getClass().getSimpleName();

    //  constructor
    public Motherboard(String brand, String model, int ramSlots) {
        this.brand = brand;
        this.model = model;
        this.ramSlots = ramSlots;
    }

    //  implementation of abstract method getStatus() from abstract class Component
    public void getStatus() {
        System.out.printf("\t%s -> %s %s (%d RAM slots)\n", className, brand, model, ramSlots);
        System.out.printf("\t%s -> status is OK\n", className);
    }

    //  overrided methods equals() and hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Motherboard)) return false;
        Motherboard that = (Motherboard) o;
        return ramSlots == that.ramSlots &&
                brand.equals(that.brand) &&
                model.equals(that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, ramSlots);
    }
}