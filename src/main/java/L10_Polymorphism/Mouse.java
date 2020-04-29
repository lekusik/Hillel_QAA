package L10_Polymorphism;

import java.util.Objects;

public class Mouse  extends Component {

    private String brand;
    private String model;
    private String interFace;
    private String buttons;

    //  constructor
    public Mouse( String brand, String model, String interFace, String buttons) {
        this.brand = brand;
        this.model = model;
        this.interFace = interFace;
        this.buttons = buttons;
    }

    //  method used in PC class
    @Override
    public void getStatus() {
        System.out.printf("%s -> %S %s %s (%s buttons)\n", getClass().getSimpleName(), interFace, brand, model, buttons);
        super.getStatus();
    }

    //  overrided methods equals() and hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mouse)) return false;
        Mouse mouse = (Mouse) o;
        return brand.equals(mouse.brand) &&
                model.equals(mouse.model) &&
                interFace.equals(mouse.interFace) &&
                buttons.equals(mouse.buttons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, interFace, buttons);
    }
}