package L11_Interfaces;

import java.util.Objects;

public class Mouse extends Component {

    //  variables for internal usage
    private String brand;
    private String model;
    private String interFace;
    private int buttons;
    private String className = getClass().getSimpleName();

    //  constructor
    public Mouse( String brand, String model, String interFace, int buttons) {
        this.brand = brand;
        this.model = model;
        this.interFace = interFace;
        this.buttons = buttons;
    }

    //  implementation of abstract method getStatus() from abstract class Component
    public void getStatus() {
        System.out.printf("%s -> %S %s %s (%d buttons)\n", className, interFace, brand, model, buttons);
        System.out.printf("\t%s -> status is OK\n", className);
    }

    //  overrided methods equals() and hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mouse)) return false;
        Mouse mouse = (Mouse) o;
        return buttons == mouse.buttons &&
                brand.equals(mouse.brand) &&
                model.equals(mouse.model) &&
                interFace.equals(mouse.interFace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, interFace, buttons);
    }
}