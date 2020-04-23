package Lesson9_HW_Composition;

import java.util.Scanner;

public class Keyboard {

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
    public void getStatus() {
        System.out.printf("Keyboard -> %S %s %s\n", interFace, brand, model);
        if (backLight.equals("true"))
            System.out.println("\tBackLight is ON");
        else
            System.out.println("\tBackLight is OFF");
    }

    //  method used in Main class - reading data from keyboard
    public String readFromKB() {
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
}