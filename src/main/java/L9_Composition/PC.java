package L9_Composition;

public class PC {

    private String name;
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;
    private SystemUnit systemUnit;

    //  constructor
    public PC(String name, Monitor monitor, Keyboard keyboard, Mouse mouse, SystemUnit systemUnit) {
        this.name = name;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.systemUnit = systemUnit;
    }

    //  getters
    public Monitor getMonitor() { return monitor; }
    public Keyboard getKeyboard() { return keyboard; }
    public SystemUnit getSystemUnit() { return systemUnit; }

    //  method used in Lesson7_HW_OOP.Main class - PC turn ON
    public void turnON() {
        System.out.printf("PC -> %s is turned ON\n", name);
        monitor.getStatus();
        monitor.toggle(1);
        keyboard.getStatus();
        mouse.getStatus();
        systemUnit.getStatus();
        System.out.println("Hello!");
    }

    //  method used in Lesson7_HW_OOP.Main class - PC turn OFF
    public void turnOFF() {
        System.out.printf("PC -> %s is turned OFF\n", name);
        monitor.toggle(0);
        System.out.println("Bye!");
    }
}