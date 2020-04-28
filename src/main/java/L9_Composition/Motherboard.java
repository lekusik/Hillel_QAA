package L9_Composition;

public class Motherboard {

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
    public void getStatus() {
        System.out.printf("\tMotherboard -> %s %s (%s RAM slots)\n", brand, model, ramSlots);
    }
}