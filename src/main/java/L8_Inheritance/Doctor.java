package L8_Inheritance;

import java.util.Scanner;

public class Doctor extends TimeLord {

    private String companion;
    private String lastwords;

    //  overrided constructor (2 additional arguments)
    public Doctor(String name, String gender, String face, String hair, String clothes,
                  String motto, String companion, String lastwords) {
        super(name, gender, face, hair, clothes, motto);
        this.companion = companion;
        this.lastwords = lastwords;
    }

    public String getCompanion() { return companion; }
    public String getLastwords() { return lastwords; }

    //  overrided methods
    @Override
    public void sayHello() {
        System.out.printf("\nDoctor => Hello! I'm %s.\n", getName());
    }

    @Override
    public void dressUp() {
        super.dressUp();
        System.out.printf("Doctor => %s are cool!\n", this.getClothes());
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Doctor => You can give me: " +
                "apple, pear, banana, carrot, yogurt, beans, bacon, fish fingers and custard\n" +
                "Choose, please");
        //  Ввод данных с клавиатуры
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output;
        switch (input) {
            case "apple":
                output = "Apple's rubbish. I hate apples.";
                break;
            case "pear":
                output = "Never eat pears. They're too squishy and they always make your chin wet.";
                break;
            case "banana":
                output = "Always take a banana to a party. Bananas are good!";
                break;
            case "carrot":
                output = "Are you insane?!";
                break;
            case "yogurt":
                output = "I hate yogurt! Just stuff with bits in it.";
                break;
            case "beans":
                output = "Beans are evil! Bad, bad beans!";
                break;
            case "bacon":
                output = "Are you trying to poison me?";
                break;
            case "fish fingers and custard":
                output = "SLURP!!!";
                break;
            default:
                output = "Unknown food. Would you like a jelly baby?";
        }
        System.out.println(output);
    }

    @Override
    public void doSomething() {
        System.out.printf("Doctor => %s, we have to stop the Master!\n" +
                "Doctor => %s\n\n", companion, getMotto());
    }

    @Override
    public void regenerate(){
        System.out.println("Doctor => Oops, I'm dying too. But I can fix it!");
        super.regenerate();
        System.out.printf("Doctor => %s\n", lastwords);
    }
}
