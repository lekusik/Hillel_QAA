package L10_Polymorphism;

import java.util.Objects;

public class Network {

    //  static variable instance of type Network
    private static Network instance = null;

    //  variable of type String
    public String state;


    //  private constructor restricted to this class itself
    private Network() {
        state = "OFF";
    }

    //  static method to create instance of Network class
    public static Network getInstance() {
        if (instance == null) {
            instance = new Network();
        }
        return instance;
    }

    //  method used in Main class - Network switches ON/OFF - GLOBALLY
    public void toggle() {
        if (state.equals("OFF")) {
            state = "ON";
        } else  {
            state = "OFF";
        }
        System.out.printf("%s -> Network is turned %s", getClass().getSimpleName(), state);
    }

    //  overrided methods equals() and hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Network)) return false;
        Network network = (Network) o;
        return state.equals(network.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state);
    }
}
