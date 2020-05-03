package L11_Interfaces;

import java.util.Objects;

public class DataStorage extends Component implements Outputtable {

    //  variables for internal usage
    private String brand;
    private String model;
    private String type;
    private int capacity;
    private String className = getClass().getSimpleName();

    //  constructor
    public DataStorage(String brand, String model, String type, int capacity) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.capacity = capacity;
    }

    //  implementation of abstract method getStatus() from abstract class Component
    public void getStatus() {
        System.out.printf("\t%s -> %s %s %s (%d Gb)\n", className, type, brand, model, capacity);
        System.out.printf("\t%s -> status is OK\n", className);
    }

    //  implementation of Outputtable interface - writing data to the disc
    public void output(String data, String fName) {
        System.out.printf("%s -> Data \"%s\" is stored to %s\n", className, data, fName);
    }

    //  overrided methods equals() and hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DataStorage)) return false;
        DataStorage that = (DataStorage) o;
        return capacity == that.capacity &&
                brand.equals(that.brand) &&
                model.equals(that.model) &&
                type.equals(that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, type, capacity);
    }
}