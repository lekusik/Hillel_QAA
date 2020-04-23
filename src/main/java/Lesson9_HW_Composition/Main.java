package Lesson9_HW_Composition;

import java.io.*;
import java.util.Scanner;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {

    public static void main(String[] args) {

        //  JSON parser object to parse file
        JSONParser jsonParser = new JSONParser();

        //  Read file from resources
        InputStreamReader reader = new InputStreamReader(Main.class.getResourceAsStream("pc.json"));
        try {
            //  Parse JSON file
            Object obj = jsonParser.parse(reader);

            JSONObject pc = (JSONObject) obj;

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
            Motherboard pcMB = new Motherboard(mbBrand, mbModel, mbRamSlots);
            CPU pcCPU = new CPU(cpuBrand, cpuModel, cpuCores, cpuSpeed);
            DataStorage pcDS = new DataStorage(dsBrand, dsModel, dsType, dsCapacity);
            RAM pcRAM = new RAM(ramBrand, ramType, ramCapacity);
            Monitor pcMonitor = new Monitor(monitorBrand, monitorModel, monitorSize, monitorResolution);
            Keyboard pcKB = new Keyboard(kbBrand, kbModel, kbInterFace, kbBackLight);
            Mouse pcMouse = new Mouse(mouseBrand, mouseModel, mouseInterFace, mouseButtons);
            SystemUnit pcSU = new SystemUnit(formFactor, pcMB, pcCPU, pcDS, pcRAM);

            //  Create the main object PC
            PC myPC = new PC(pcName, pcMonitor, pcKB, pcMouse, pcSU);
            System.out.println();

            //  Call turnON() method from PC class
            myPC.turnON();
            System.out.println();

            //  Get Monitor object from PC class and invoke display() method from Monitor class
            myPC.getMonitor().display("Type something and press the ENTER button, pls");

            //  Get Keyboard object from PC class and invoke readFromKB() method from Keyboard class
            String data = myPC.getKeyboard().readFromKB();
            myPC.getMonitor().display("Input value: " + data);

            myPC.getMonitor().display("Do you want to save it to a file? y/n");
            while (true) {
                String answer = myPC.getKeyboard().readFromKB();
                if (answer.equals("y")) {

                    //  Use chain of getters to get DataStorage object and invoke his method storeToDisc()
                    myPC.getSystemUnit().getDataStorage().storeToDisc("temp.txt", data);
                    break;
                } else if (answer.equals("n")) {
                    myPC.getMonitor().display("Oops, your data has been lost!");
                    break;
                } else {
                    System.out.println("Pls, enter \"y\" or \"n\"");   //  Wrong input
                }
            }
            System.out.println();
            //  Call turnOFF() method from PC class
            myPC.turnOFF();
        }
        //  exception handling
        catch (FileNotFoundException e) { e.printStackTrace(); }
        catch (IOException e) { e.printStackTrace(); }
        catch (ParseException e) { e.printStackTrace(); }
    }
}