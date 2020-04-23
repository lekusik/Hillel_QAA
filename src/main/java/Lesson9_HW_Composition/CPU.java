package Lesson9_HW_Composition;

public class CPU {

    private String brand;
    private String model;
    private String cores;
    private String speed;

    //  constructor
    public CPU(String brand, String model, String cores, String speed) {
        this.brand = brand;
        this.model = model;
        this.cores = cores;
        this.speed = speed;
    }

    //  method used in SystemUnit class
    public void getStatus() {
        System.out.printf("\tCPU -> %s %s (%s cores, %s GHz)\n", brand, model, cores, speed);
    }
}