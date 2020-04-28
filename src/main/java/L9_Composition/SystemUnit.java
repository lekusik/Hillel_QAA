package L9_Composition;

public class SystemUnit {

    private String formFactor;
    private Motherboard motherboard;
    private CPU cpu;
    private DataStorage dataStorage;
    private RAM ram;

    //  constructor
    public SystemUnit(String formFactor, Motherboard motherboard, CPU cpu, DataStorage dataStorage, RAM ram) {
        this.formFactor = formFactor;
        this.motherboard = motherboard;
        this.cpu = cpu;
        this.dataStorage = dataStorage;
        this.ram = ram;
    }

    //  getter for DataStorage object
    public DataStorage getDataStorage() { return dataStorage; }

    //  method used in PC class
    public void getStatus() {
        System.out.println("SystemUnit -> " + formFactor);
        motherboard.getStatus();
        cpu.getStatus();
        dataStorage.getStatus();
        ram.getStatus();
    }

}