package L11_Interfaces;

import java.util.ArrayList;

public class PCUtils {

    //  HW L9_Composition - static method - to work with the PC
    public static void pcWork (PC pc) {
        //  Call toggle() method from PC class - switch ON
        pc.toggle();
        System.out.println();

        //  Get Monitor object from PC class and invoke display() method from Monitor class
        pc.getMonitor().output("Type something and press the ENTER button, pls");

        //  Get Keyboard object from PC class and invoke readFromKB() method from Keyboard class
        String data = pc.getKeyboard().input();
        pc.getMonitor().output("Input value: " + data);

        pc.getMonitor().output("Do you want to save it to a file? y/n");
        while (true) {
            String answer = pc.getKeyboard().input();
            if (answer.equals("y")) {

                //  Use chain of getters to get DataStorage object and invoke his method storeToDisc()
                pc.getSystemUnit().getDataStorage().output(data, "temp.txt");
                break;
            } else if (answer.equals("n")) {
                pc.getMonitor().output("Oops, your data has been lost!");
                break;
            } else {
                System.out.println("Pls, enter \"y\" or \"n\"");   //  Wrong input
            }
        }
        System.out.println();
        //  Call toggle() method from PC class - switch OFF
        pc.toggle();
    }

    //  HW L10_Singleton - static method - to toggle the Network
    public static void pcNetworkSwitch (ArrayList<PC> pcList) {
        //  Take 3 pcs from the pcList
        PC pc1 = pcList.get(0);
        PC pc2 = pcList.get(1);
        PC pc3 = pcList.get(2);

        //  Check network state of all 3 pcs before toggling
        System.out.println("Checking the network state of all 3 PCs fefore toggling:");
        System.out.printf("PC:\t %s \tNetwork is %s\n", pc1.getName(), pc1.getNetwork().getState());
        System.out.printf("PC:\t %s \tNetwork is %s\n", pc2.getName(), pc2.getNetwork().getState());
        System.out.printf("PC:\t %s \tNetwork is %s\n", pc3.getName(), pc3.getNetwork().getState());
        System.out.println();

        //  Take first pc from the list and toggle the network (singleton usage)
        System.out.printf("Toggle the network (singleton usage) of %s\n", pc1.getName());
        pc1.getNetwork().toggle();
        System.out.println();

        //  Check network state of all 3 pcs after toggling
        System.out.println("Checking the network state of all 3 PCs after toggling:");
        System.out.printf("PC:\t %s \tNetwork is %s\n", pc1.getName(), pc1.getNetwork().getState());
        System.out.printf("PC:\t %s \tNetwork is %s\n", pc2.getName(), pc2.getNetwork().getState());
        System.out.printf("PC:\t %s \tNetwork is %s\n", pc3.getName(), pc3.getNetwork().getState());
    }

    //  L10_overrided_equals_hashCode - static method - to compare PCs
    public static void pcCompare (ArrayList<PC> pcList) {
        //  Take 3 pcs from the pcList
        PC pc1 = pcList.get(0);
        PC pc2 = pcList.get(1);
        PC pc3 = pcList.get(2);

        //  Compare pc1 and pc2 with overrided method equals()
        System.out.printf("Comparing %s and %s with overrided method equals():\n", pc1.getName(), pc2.getName());
        System.out.println("(PCs have different names but the same components)");
        System.out.printf("%s == %s -> %b\n", pc1.getName(), pc2.getName(), pc1.equals(pc2));
        System.out.printf("HashCode of %s = %d\n", pc1.getName(), pc1.hashCode());
        System.out.printf("HashCode of %s = %d\n", pc2.getName(), pc2.hashCode());
        System.out.println();

        //  Compare pc1 and pc3 with overrided method equals()
        System.out.printf("Comparing %s and %s with overrided method equals():\n", pc1.getName(), pc3.getName());
        System.out.println("(PCs have different components)");
        System.out.printf("%s == %s -> %b\n", pc1.getName(), pc3.getName(), pc1.equals(pc3));
        System.out.printf("HashCode of %s = %d\n", pc1.getName(), pc1.hashCode());
        System.out.printf("HashCode of %s = %d\n", pc3.getName(), pc3.hashCode());
    }
}
