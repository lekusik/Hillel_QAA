package Lesson8_HW_Inheritance;

public class Master extends TimeLord {

    //  overrided constructor (the same as in the parent class)
    public Master(String name, String gender, String face, String hair, String clothes, String motto) {
        super(name, gender, face, hair, clothes, motto);
    }

    //  overrided methods
    @Override
    public void sayHello() {
        System.out.printf("\nMaster => Hello! I'm %s.\n", getName());
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Master => I can eat everything! I'm SO HUNGRY!!!\n");
    }

    @Override
    public void dressUp() {
        super.dressUp();
        System.out.println("Master => Everyone has to look like ME!!!");
    }

    @Override
    public void doSomething() {
        System.out.println("Master => I wanna take over the World!!!");
        System.out.printf("Master => %s\n", getMotto());
    }

    @Override
    public void regenerate(){
        System.out.println("Master => Oh no! Doctor stopped me!");
        super.regenerate();
        System.out.println("Master => The Master REBORN!\n");
    }
}
