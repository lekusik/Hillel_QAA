package L11_Interfaces;

import java.util.Objects;

public class Network extends Component implements Toggleable {

    //  static variable instance of type Network
    private static Network instance = null;

    //  variables for internal usage
    private String className = getClass().getSimpleName();
    private ToggleState state;

    //  private constructor restricted to this class itself
    private Network() {
        state = ToggleState.OFF;
    }

    //  static method to create instance of Network class
    public static Network getInstance() {
        if (instance == null) {
            instance = new Network();
        }
        return instance;
    }

    //  getter
    public ToggleState getState() { return state; }

    //  implementation of Toggleable interface - network switches ON/OFF - GLOBALLY
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

    //  implementation of abstract method getStatus() from abstract class Component
    public void getStatus() {
        System.out.printf("%s is %s\n", className, state);
        System.out.printf("\t%s -> status is OK\n", className);
    }
}