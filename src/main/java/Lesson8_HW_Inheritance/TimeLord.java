package Lesson8_HW_Inheritance;

public class TimeLord {

    private String name;
    private String gender;
    private String face;
    private String hair;
    private String clothes;
    private String motto;

    public TimeLord(String name, String gender, String face, String hair, String clothes, String motto) {
        this.name = name;
        this.gender = gender;
        this.face = face;
        this.hair = hair;
        this.clothes = clothes;
        this.motto = motto;
    }

    public String getName() { return name; }
    public String getGender() { return gender; }
    public String getFace() { return face; }
    public String getHair() { return hair; }
    public String getClothes() { return clothes; }
    public String getMotto() { return motto; }

    public void sayHello(){}

    public void lookAtMe(){
        System.out.printf("TimeLord => I'm a %s now. I'm %s and have a %s hair.\n", gender, face, hair);
        dressUp();
    }

    public void dressUp(){
        System.out.printf("TimeLord => I wear %s now.\n", clothes);
    }

    public void eat(){
        System.out.println("TimeLord => Give me something to eat");
    }

    public void doSomething(){}

    public void regenerate(){
        System.out.println("TimeLord => I can regenerate!");
    }
}
