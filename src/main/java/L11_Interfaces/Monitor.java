package L11_Interfaces;

import java.util.Objects;

public class Monitor extends Component implements Outputtable, Toggleable {

    //  variables for internal usage
    private String brand;
    private String model;
    private int size;
    private String resolution;
    private String className = getClass().getSimpleName();
    private ToggleState state;

    //  constructor
    public Monitor(String brand, String model, int size, String resolution) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.resolution = resolution;
        state = ToggleState.OFF;
    }

    //  implementation of abstract method getStatus() from abstract class Component
    public void getStatus() {
        System.out.printf("%s -> %s %s (%d inch, %s)\n", className, brand, model, size, resolution);
        System.out.printf("\t%s -> status is OK\n", className);
    }

    //  implementation of Toggleable interface - monitor switches ON/OFF
    public void toggle() {
        switch(state) {
            case ON:
                state = ToggleState.OFF;
                break;
            case OFF:
                state = ToggleState.ON;
                break;
        }
        System.out.printf("%s is turned %s\n", className, state);
    }

    //  implementation of Outputtable interface
    public void output(String data, String fName) {
        System.out.printf("%s -> %s\n", className, data);
    }

    //  overloaded method output() - data display
    public void output(String data) {
        this.output(data, "");
    }

    //  overrided methods equals() and hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monitor)) return false;
        Monitor monitor = (Monitor) o;
        return  size == monitor.size &&
                brand.equals(monitor.brand) &&
                model.equals(monitor.model) &&
                resolution.equals(monitor.resolution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, size, resolution);
    }
}