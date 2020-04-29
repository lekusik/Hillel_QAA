package L10_Polymorphism;

import java.util.Objects;
import java.util.Scanner;

public class Keyboard  extends Component {

    private String brand;
    private String model;
    private String interFace;
    private String backLight;

    //  constructor
    public Keyboard(String brand, String model, String interFace, String backLight) {
        this.brand = brand;
        this.model = model;
        this.interFace = interFace;
        this.backLight = backLight;
    }

    //  method used in PC class
    @Override
    public void getStatus() {
        System.out.printf("%s -> %S %s %s\n", getClass().getSimpleName(), interFace, brand, model);
        super.getStatus();
        if (backLight.equals("true"))
            System.out.println("\tBackLight is ON");
        else
            System.out.println("\tBackLight is OFF");
    }

    //  method used in Lesson7_HW_OOP.Main class - reading data from keyboard
    @Override
    public String input() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if (!input.isEmpty()) {
                return input;
            } else {
                System.out.println("Empty value. Pls try again");   //  empty value
            }
        }
    }

    //  overrided methods equals() and hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Keyboard)) return false;
        Keyboard keyboard = (Keyboard) o;
        return brand.equals(keyboard.brand) &&
                model.equals(keyboard.model) &&
                interFace.equals(keyboard.interFace) &&
                backLight.equals(keyboard.backLight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, interFace, backLight);
    }
}