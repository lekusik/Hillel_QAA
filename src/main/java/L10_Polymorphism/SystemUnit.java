package L10_Polymorphism;

import java.util.Objects;

public class SystemUnit  extends Component {

    private String formFactor;
    private Component motherboard;
    private Component cpu;
    private Component dataStorage;
    private Component ram;

    //  constructor
    public SystemUnit(String formFactor, Component motherboard, Component cpu, Component dataStorage, Component ram) {
        this.formFactor = formFactor;
        this.motherboard = motherboard;
        this.cpu = cpu;
        this.dataStorage = dataStorage;
        this.ram = ram;
    }

    //  getter for DataStorage object
    public DataStorage getDataStorage() { return (DataStorage) dataStorage; }

    //  method used in PC class
    @Override
    public void getStatus() {
        System.out.printf("%s -> %s\n", getClass().getSimpleName(), formFactor);
        motherboard.getStatus();
        cpu.getStatus();
        dataStorage.getStatus();
        ram.getStatus();
    }

    //  overrided methods equals() and hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SystemUnit)) return false;
        SystemUnit that = (SystemUnit) o;
        return formFactor.equals(that.formFactor) &&
                motherboard.equals(that.motherboard) &&
                cpu.equals(that.cpu) &&
                getDataStorage().equals(that.getDataStorage()) &&
                ram.equals(that.ram);
    }

    @Override
    public int hashCode() {
        return Objects.hash(formFactor, motherboard, cpu, getDataStorage(), ram);
    }
}