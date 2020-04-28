package L9_Composition;

public class RAM {

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
    public void getStatus() {
        System.out.printf("\tRAM -> %s %s (%s Gb)\n", brand, type, capacity);
    }
}