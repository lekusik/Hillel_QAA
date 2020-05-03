package L11_Interfaces;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//  Helper class for working with JSONs and converting them to the PCs
public class JsonHelper {

    public static JSONObject fileToJsonObj (String fileName) throws IOException, ParseException {
        //  JSON parser object to parse file
        JSONParser jsonParser = new JSONParser();

        //  Read file from resources
        InputStreamReader reader = new InputStreamReader(Main.class.getResourceAsStream(fileName));

        //  Parse JSON file
        Object obj = jsonParser.parse(reader);
        JSONObject jsonObj = (JSONObject) obj;

        return jsonObj;
    }

    public static ArrayList<PC> jsonArrayToArrayList (JSONArray pcArray) {
        //  Create list of PCs
        System.out.println();
        System.out.println("List of PCs:");
        ArrayList<PC> pcList = new ArrayList<>();
        for (Object pcObj: pcArray) {
            PC pc = jsonObjToPC((JSONObject) pcObj);
            pcList.add(pc);
            System.out.printf("PC %s\t is added to the list\n", pc.getName());
        }
        return pcList;
    }

    public static PC jsonObjToPC (JSONObject pc) {
        //  Get pcName
        String pcName = (String) pc.get("name");

        //  Get monitor info
        JSONObject monitor = (JSONObject) pc.get("monitor");
        String monitorBrand = (String) monitor.get("brand");
        String monitorModel = (String) monitor.get("model");
//        int monitorSize = ((Long) monitor.get("size")).intValue();
        int monitorSize = (int) ((long) monitor.get("size"));
        String monitorResolution = (String) monitor.get("resolution");

        //  Get keyboard info
        JSONObject kb = (JSONObject) pc.get("keyboard");
        String kbBrand = (String) kb.get("brand");
        String kbModel = (String) kb.get("model");
        String kbInterFace = (String) kb.get("interFace");
        boolean kbBackLight = (boolean) kb.get("backLight");

        //  Get mouse info
        JSONObject mouse = (JSONObject) pc.get("mouse");
        String mouseBrand = (String) mouse.get("brand");
        String mouseModel = (String) mouse.get("model");
        String mouseInterFace = (String) mouse.get("interFace");
        int mouseButtons = (int) ((long)  mouse.get("buttons"));

        //  Get systemUnit info
        JSONObject su = (JSONObject) pc.get("systemUnit");
        String formFactor = (String) su.get("formFactor");

        //  Get motherBoard info
        JSONObject mb = (JSONObject) su.get("motherboard");
        String mbBrand = (String) mb.get("brand");
        String mbModel = (String) mb.get("model");
        int mbRamSlots = (int) ((long)  mb.get("ramSlots"));

        //  Get cpu info
        JSONObject cpu = (JSONObject) su.get("cpu");
        String cpuBrand = (String) cpu.get("brand");
        String cpuModel = (String) cpu.get("model");
        int cpuCores = (int) ((long) cpu.get("cores"));
        double cpuSpeed = (double) cpu.get("speed");

        //  Get dataStorage info
        JSONObject ds = (JSONObject) su.get("dataStorage");
        String dsBrand = (String) ds.get("brand");
        String dsModel = (String) ds.get("model");
        String dsType = (String) ds.get("type");
        int dsCapacity = (int) ((long) ds.get("capacity"));

        //  Get ram info
        JSONObject ram = (JSONObject) su.get("ram");
        String ramBrand = (String) ram.get("brand");
        String ramType = (String) ram.get("type");
        int ramCapacity = (int) ((long) ram.get("capacity"));

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
}
