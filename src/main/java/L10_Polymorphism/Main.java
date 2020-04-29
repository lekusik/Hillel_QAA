package L10_Polymorphism;

import java.io.*;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {

        //  JSON parser object to parse file
        JSONParser jsonParser = new JSONParser();

        //  Read file from resources
        String fileName = "pc.json";
        InputStreamReader reader = new InputStreamReader(Main.class.getResourceAsStream(fileName));

        //  Parse JSON file
        Object obj = jsonParser.parse(reader);
        JSONObject jsonObj = (JSONObject) obj;
        JSONArray pcArray = (JSONArray) jsonObj.get("pc");

        //  Create list of PCs
        System.out.println();
        System.out.println("List of PCs:");
        ArrayList<PC> pcList = new ArrayList<>();
        for (Object pcObj: pcArray
             ) {
            PC pc = jsonObjToPC((JSONObject) pcObj);
            pcList.add(pc);
            System.out.printf("PC:\t %s \tNetwork is %s\n", pc.getName(), pc.getNetwork().state);
        }
        System.out.println();

        //  Take 3 pcs from the pcList
        PC pc1 = pcList.get(0);
        PC pc2 = pcList.get(1);
        PC pc3 = pcList.get(2);

        //  Take first pc from the list and toggle the network (singleton usage)
        System.out.println("Taking the first pc from the list and toggle the network (singleton usage)");
        pc1.getNetwork().toggle();
        System.out.println();

        //  Check network state of all 3 pcs
        System.out.println("Checking the network state of all 3 PCs:");
        System.out.printf("PC:\t %s \tNetwork is %s\n", pc1.getName(), pc1.getNetwork().state);
        System.out.printf("PC:\t %s \tNetwork is %s\n", pc2.getName(), pc2.getNetwork().state);
        System.out.printf("PC:\t %s \tNetwork is %s\n", pc3.getName(), pc3.getNetwork().state);
        System.out.println();

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

    public static PC jsonObjToPC (JSONObject pc) {
        //  Get pcName
        String pcName = (String) pc.get("name");

        //  Get monitor info
        JSONObject monitor = (JSONObject) pc.get("monitor");
        String monitorBrand = (String) monitor.get("brand");
        String monitorModel = (String) monitor.get("model");
        String monitorSize = (String) monitor.get("size");
        String monitorResolution = (String) monitor.get("resolution");

        //  Get keyboard info
        JSONObject kb = (JSONObject) pc.get("keyboard");
        String kbBrand = (String) kb.get("brand");
        String kbModel = (String) kb.get("model");
        String kbInterFace = (String) kb.get("interFace");
        String kbBackLight = (String) kb.get("backLight");

        //  Get mouse info
        JSONObject mouse = (JSONObject) pc.get("mouse");
        String mouseBrand = (String) mouse.get("brand");
        String mouseModel = (String) mouse.get("model");
        String mouseInterFace = (String) mouse.get("interFace");
        String mouseButtons = (String) mouse.get("buttons");

        //  Get systemUnit info
        JSONObject su = (JSONObject) pc.get("systemUnit");
        String formFactor = (String) su.get("formFactor");

        //  Get motherBoard info
        JSONObject mb = (JSONObject) su.get("motherboard");
        String mbBrand = (String) mb.get("brand");
        String mbModel = (String) mb.get("model");
        String mbRamSlots = (String) mb.get("ramSlots");

        //  Get cpu info
        JSONObject cpu = (JSONObject) su.get("cpu");
        String cpuBrand = (String) cpu.get("brand");
        String cpuModel = (String) cpu.get("model");
        String cpuCores = (String) cpu.get("cores");
        String cpuSpeed = (String) cpu.get("speed");

        //  Get dataStorage info
        JSONObject ds = (JSONObject) su.get("dataStorage");
        String dsBrand = (String) ds.get("brand");
        String dsModel = (String) ds.get("model");
        String dsType = (String) ds.get("type");
        String dsCapacity = (String) ds.get("capacity");

        //  Get ram info
        JSONObject ram = (JSONObject) su.get("ram");
        String ramBrand = (String) ram.get("brand");
        String ramType = (String) ram.get("type");
        String ramCapacity = (String) ram.get("capacity");

        //  Create objects for all PC parts
        Component pcMB = new Motherboard(mbBrand, mbModel, mbRamSlots);
        Component pcCPU = new CPU(cpuBrand, cpuModel, cpuCores, cpuSpeed);
        Component pcDS = new DataStorage(dsBrand, dsModel, dsType, dsCapacity);
        Component pcRAM = new RAM(ramBrand, ramType, ramCapacity);
        Component pcMonitor = new Monitor(monitorBrand, monitorModel, monitorSize, monitorResolution);
        Component pcKB = new Keyboard(kbBrand, kbModel, kbInterFace, kbBackLight);
        Component pcMouse = new Mouse(mouseBrand, mouseModel, mouseInterFace, mouseButtons);
        Component pcSU = new SystemUnit(formFactor, pcMB, pcCPU, pcDS, pcRAM);

        //  instantiating Network class with variable pcNetwork
        Network pcNetwork = Network.getInstance();

        //  Create the main object PC
        return new PC(pcName, pcMonitor, pcKB, pcMouse, pcSU, pcNetwork);
    }

    public static void pcWork (PC pc){
        System.out.println();

        //  Call turnON() method from PC class
        pc.turnON();
        System.out.println();

        //  Get Monitor object from PC class and invoke display() method from Monitor class
        pc.getMonitor().output("Type something and press the ENTER button, pls", "");

        //  Get Keyboard object from PC class and invoke readFromKB() method from Keyboard class
        String data = pc.getKeyboard().input();
        pc.getMonitor().output("Input value: " + data, "");

        pc.getMonitor().output("Do you want to save it to a file? y/n", "");
        while (true) {
            String answer = pc.getKeyboard().input();
            if (answer.equals("y")) {

                //  Use chain of getters to get DataStorage object and invoke his method storeToDisc()
                pc.getSystemUnit().getDataStorage().output(data, "temp.txt");
                break;
            } else if (answer.equals("n")) {
                pc.getMonitor().output("Oops, your data has been lost!", "");
                break;
            } else {
                System.out.println("Pls, enter \"y\" or \"n\"");   //  Wrong input
            }
        }
        System.out.println();
        //  Call turnOFF() method from PC class
        pc.turnOFF();
    }
}
