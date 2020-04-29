package L10_Polymorphism;

import java.util.Objects;

public class CPU extends Component {

    private String brand;
    private String model;
    private String cores;
    private String speed;

    //  constructor
    public CPU(String brand, String model, String cores, String speed) {
        this.brand = brand;
        this.model = model;
        this.cores = cores;
        this.speed = speed;
    }

    //  method used in SystemUnit class
    @Override
    public void getStatus() {
        System.out.printf("\t%s -> %s %s (%s cores, %s GHz)\n", getClass().getSimpleName(), brand, model, cores, speed);
        super.getStatus();
    }

    //  overrided methods equals() and hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CPU)) return false;
        CPU cpu = (CPU) o;
        return brand.equals(cpu.brand) &&
                model.equals(cpu.model) &&
                cores.equals(cpu.cores) &&
                speed.equals(cpu.speed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, cores, speed);
    }
}