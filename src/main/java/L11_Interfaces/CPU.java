package L11_Interfaces;

import java.util.Objects;

public class CPU extends Component {

    //  variables for internal usage
    private String brand;
    private String model;
    private int cores;
    private double speed;
    private String className = getClass().getSimpleName();

    //  constructor
    public CPU(String brand, String model, int cores, double speed) {
        this.brand = brand;
        this.model = model;
        this.cores = cores;
        this.speed = speed;
    }

    //  implementation of abstract method getStatus() from abstract class Component
    public void getStatus() {
        System.out.printf("\t%s -> %s %s (%d cores, %f GHz)\n", className, brand, model, cores, speed);
        System.out.printf("\t%s -> status is OK\n", className);
    }

    //  overrided methods equals() and hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CPU)) return false;
        CPU cpu = (CPU) o;
        return cores == cpu.cores &&
                Double.compare(cpu.speed, speed) == 0 &&
                brand.equals(cpu.brand) &&
                model.equals(cpu.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, cores, speed);
    }
}