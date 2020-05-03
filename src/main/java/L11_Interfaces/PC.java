package L11_Interfaces;

import java.util.Objects;

public class PC implements Toggleable {

    //  variables for internal usage
    private String name;
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;
    private SystemUnit systemUnit;
    private Network network;
    private String className = getClass().getSimpleName();
    private ToggleState state;

    //  constructor
    public PC(String name, Component monitor, Component keyboard, Component mouse, Component systemUnit, Network network) {
        this.name = name;
        this.monitor = (Monitor) monitor;
        this.keyboard = (Keyboard) keyboard;
        this.mouse = (Mouse) mouse;
        this.systemUnit = (SystemUnit) systemUnit;
        this.network = network;
        state = ToggleState.OFF;
    }

    //  getters
    public String getName() { return name; }
    public Monitor getMonitor() { return monitor; }
    public Keyboard getKeyboard() { return keyboard; }
    public Mouse getMouse() { return mouse; }
    public SystemUnit getSystemUnit() { return systemUnit; }
    public Network getNetwork() { return network; }

    //  implementation of Toggleable interface - PC switches ON/OFF
    public void toggle() {
        switch(state) {
            case ON:
                state = ToggleState.OFF;
                System.out.printf("%s -> %s is turned %s\n", className, name, state);
                systemUnit.toggle();
                monitor.toggle();
                System.out.printf("%s -> Bye!\n", className);
                break;
            case OFF:
                state = ToggleState.ON;
                System.out.printf("%s -> %s is turned %s\n", className, name, state);
                systemUnit.toggle();
                systemUnit.getStatus();
                monitor.toggle();
                monitor.getStatus();
                keyboard.getStatus();
                mouse.getStatus();
                System.out.printf("%s -> Hello!\n", className);
                break;
        }
    }

    //  overrided methods equals() and hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PC)) return false;
        PC pc = (PC) o;
        return monitor.equals(pc.monitor) &&
                keyboard.equals(pc.keyboard) &&
                mouse.equals(pc.mouse) &&
                systemUnit.equals(pc.systemUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(monitor, keyboard, mouse, systemUnit);
    }
}