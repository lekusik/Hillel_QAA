package L10_Polymorphism;

import java.util.Objects;

public class Monitor extends Component {

    private String brand;
    private String model;
    private String size;
    private String resolution;

    // constants
    private int ON = 1;
    private int OFF = 0;

    //  constructor
    public Monitor(String brand, String model, String size, String resolution) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.resolution = resolution;
    }

    //  method used in PC class
    @Override
    public void getStatus() {
        System.out.printf("%s -> %s %s (%s inch, %s)\n", getClass().getSimpleName(), brand, model, size, resolution);
        super.getStatus();
    }

    //  method used in PC class - monitor switches ON/OFF
    @Override
    public void toggle(int state) {
        if (state == ON)
            System.out.println("\tMonitor is turned ON");
        else if (state==OFF)
            System.out.println("\tMonitor is turned OFF");
        else
            System.out.println("\tState is invalid");
    }

    //  method used in Lesson7_HW_OOP.Main class - display data on the screen
    @Override
    public void output(String data, String fName) {
        System.out.printf("%s -> %s\n", getClass().getSimpleName(), data);
    }

    //  overrided methods equals() and hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monitor)) return false;
        Monitor monitor = (Monitor) o;
        return ON == monitor.ON &&
                OFF == monitor.OFF &&
                brand.equals(monitor.brand) &&
                model.equals(monitor.model) &&
                size.equals(monitor.size) &&
                resolution.equals(monitor.resolution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, size, resolution, ON, OFF);
    }
}