package Lesson9_HW_Composition;

public class DataStorage {

    private String brand;
    private String model;
    private String type;
    private String capacity;

    //  constructor
    public DataStorage(String brand, String model, String type, String capacity) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.capacity = capacity;
    }

    //  method used in SystemUnit class
    public void getStatus() {
        System.out.printf("\tDataStorage -> %s %s %s (%s Gb)\n", type, brand, model, capacity);
    }

    //  method used in Main class - writing data to the disc
    public void storeToDisc(String fName, String data){
        System.out.printf("DataStorage -> Data \"%s\" is stored to %s\n", data, fName);
    }
}