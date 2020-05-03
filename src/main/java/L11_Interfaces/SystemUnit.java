package L11_Interfaces;

import java.util.Objects;

public class SystemUnit extends Component implements Toggleable {

    private String formFactor;
    private Motherboard motherboard;
    private CPU cpu;
    private DataStorage dataStorage;
    private RAM ram;
    private String className = getClass().getSimpleName();
    private ToggleState state;

    //  constructor
    public SystemUnit(String formFactor, Component motherboard, Component cpu, Component dataStorage, Component ram) {
        this.formFactor = formFactor;
        this.motherboard = (Motherboard) motherboard;
        this.cpu = (CPU) cpu;
        this.dataStorage = (DataStorage) dataStorage;
        this.ram = (RAM) ram;
        state = ToggleState.OFF;
    }

    //  getter for DataStorage object
    public DataStorage getDataStorage() { return dataStorage; }

    //  implementation of abstract method getStatus() from abstract class Component
    public void getStatus() {
        System.out.printf("%s -> %s\n", className, formFactor);
        motherboard.getStatus();
        cpu.getStatus();
        dataStorage.getStatus();
        ram.getStatus();
    }

    //  implementation of Toggleable interface - SystemUnit switches ON/OFF
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

    //  overrided methods equals() and hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SystemUnit)) return false;
        SystemUnit that = (SystemUnit) o;
        return formFactor.equals(that.formFactor) &&
                motherboard.equals(that.motherboard) &&
                cpu.equals(that.cpu) &&
                dataStorage.equals(that.dataStorage) &&
                ram.equals(that.ram);
    }

    @Override
    public int hashCode() {
        return Objects.hash(formFactor, motherboard, cpu, dataStorage, ram);
    }
}