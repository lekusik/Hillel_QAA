package L10_Polymorphism;

import java.util.Objects;

public class PC {

    private String name;
    private Component monitor;
    private Component keyboard;
    private Component mouse;
    private Component systemUnit;
    private Network network;

    //  constructor
    public PC(String name, Component monitor, Component keyboard, Component mouse, Component systemUnit, Network network) {
        this.name = name;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.systemUnit = systemUnit;
        this.network = network;
    }

    //  getters
    public Monitor getMonitor() { return (Monitor) monitor; }
    public Keyboard getKeyboard() { return (Keyboard) keyboard; }
    public SystemUnit getSystemUnit() { return (SystemUnit) systemUnit; }
    public Network getNetwork() { return network; }
    public String getName() { return name; }
    public Component getMouse() { return mouse; }

    //  method used in Lesson7_HW_OOP.Main class - PC turn ON
    public void turnON() {
        System.out.printf("%s -> %s is turned ON\n", getClass().getSimpleName(), name);
        monitor.getStatus();
        monitor.toggle(1);
        keyboard.getStatus();
        mouse.getStatus();
        systemUnit.getStatus();
        System.out.println("Hello!");
    }

    //  method used in Lesson7_HW_OOP.Main class - PC turn OFF
    public void turnOFF() {
        System.out.printf("%s -> %s is turned OFF\n", getClass().getSimpleName(), name);
        monitor.toggle(0);
        System.out.println("Bye!");
    }

    //  overrided methods equals() and hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PC)) return false;
        PC pc = (PC) o;
        return  getMonitor().equals(pc.getMonitor()) &&
                getKeyboard().equals(pc.getKeyboard()) &&
                getMouse().equals(pc.getMouse()) &&
                getSystemUnit().equals(pc.getSystemUnit()) &&
                getNetwork().equals(pc.getNetwork());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMonitor(), getKeyboard(), getMouse(), getSystemUnit(), getNetwork());
    }
}