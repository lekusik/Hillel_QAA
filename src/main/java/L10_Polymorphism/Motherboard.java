package L10_Polymorphism;

import java.util.Objects;

public class Motherboard  extends Component {

    private String brand;
    private String model;
    private String ramSlots;

    //  constructor
    public Motherboard(String brand, String model, String ramSlots) {
        this.brand = brand;
        this.model = model;
        this.ramSlots = ramSlots;
    }

    //  method used in SystemUnit class
    @Override
    public void getStatus() {
        System.out.printf("\t%s -> %s %s (%s RAM slots)\n", getClass().getSimpleName(), brand, model, ramSlots);
        super.getStatus();
    }

    //  overrided methods equals() and hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Motherboard)) return false;
        Motherboard that = (Motherboard) o;
        return brand.equals(that.brand) &&
                model.equals(that.model) &&
                ramSlots.equals(that.ramSlots);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, ramSlots);
    }
}