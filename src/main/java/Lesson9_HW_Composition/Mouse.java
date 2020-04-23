package Lesson9_HW_Composition;

public class Mouse {

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
    public void getStatus() {
        System.out.printf("Mouse -> %S %s %s (%s buttons)\n", interFace, brand, model, buttons);
    }
}