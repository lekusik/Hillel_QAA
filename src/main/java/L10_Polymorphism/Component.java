package L10_Polymorphism;

public class Component {

    public void getStatus() {
        System.out.printf("%s -> status is OK\n", getClass().getSimpleName());
    }

    public String input() {
        return getClass().getSimpleName() + " -> input";
    }

    public void output(String data, String fName) {}

    public void toggle(int i) {}


}