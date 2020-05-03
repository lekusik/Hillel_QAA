package L11_Interfaces;

import java.util.Objects;
import java.util.Scanner;

public class Keyboard extends Component implements Inputtable {

    //  variables for internal usage
    private String brand;
    private String model;
    private String interFace;
    private boolean backLight;
    private String className = getClass().getSimpleName();

    //  constructor
    public Keyboard(String brand, String model, String interFace, boolean backLight) {
        this.brand = brand;
        this.model = model;
        this.interFace = interFace;
        this.backLight = backLight;
    }

    //  implementation of abstract method getStatus() from abstract class Component
    public void getStatus() {
        System.out.printf("%s -> %s %s %s\n", className, interFace, brand, model);
        if (backLight)
            System.out.printf("\t%s has a backLight\n", className);
        else
            System.out.printf("\t%s does not have a backLight\n", className);
        System.out.printf("\t%s -> status is OK\n", className);
    }

    //  method used in Main class - reading data from keyboard
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
        return backLight == keyboard.backLight &&
                brand.equals(keyboard.brand) &&
                model.equals(keyboard.model) &&
                interFace.equals(keyboard.interFace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, interFace, backLight);
    }
}