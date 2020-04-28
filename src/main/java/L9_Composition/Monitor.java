package L9_Composition;

public class Monitor {

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
    public void getStatus() {
        System.out.printf("Monitor -> %s %s (%s inch, %s)\n", brand, model, size, resolution);
    }

    //  method used in PC class - monitor switch ON/OFF
    public void toggle(int state) {
        if (state == ON)
            System.out.println("\tMonitor is turned ON");
        else if (state==OFF)
            System.out.println("\tMonitor is turned OFF");
        else
            System.out.println("\tState is invalid");
    }

    //  method used in Lesson7_HW_OOP.Main class - display data on the screen
    public void display(String data) {
        System.out.println("Monitor -> " + data);
    }
}