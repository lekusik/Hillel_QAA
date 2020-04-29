package L10_Polymorphism;

import java.util.Objects;

public class DataStorage  extends Component {

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
    @Override
    public void getStatus() {
        System.out.printf("\t%s -> %s %s %s (%s Gb)\n", getClass().getSimpleName(), type, brand, model, capacity);
        super.getStatus();
    }

    //  method used in Lesson7_HW_OOP.Main class - writing data to the disc
    @Override
    public void output(String data, String fName){
        System.out.printf("%s -> Data \"%s\" is stored to %s\n", getClass().getSimpleName(), data, fName);
    }

    //  overrided methods equals() and hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DataStorage)) return false;
        DataStorage that = (DataStorage) o;
        return brand.equals(that.brand) &&
                model.equals(that.model) &&
                type.equals(that.type) &&
                capacity.equals(that.capacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, type, capacity);
    }
}