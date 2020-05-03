package L11_Interfaces;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {

        //  reading json from a file and parsing it to the JSONObject
        String fileName = "pc.json";
        JSONObject jsonObj = JsonHelper.fileToJsonObj(fileName);

        //  converting JSONArray to ArrayList<PC> pcList
        JSONArray pcArray = (JSONArray) jsonObj.get("pc");
        ArrayList<PC> pcList = JsonHelper.jsonArrayToArrayList(pcArray);

        //  choosing the method from class PCUtils
        System.out.println();
        System.out.println("Hello!");
        System.out.println("Press 1 to work with PC");  //  method pcWork() - HW L9_Composition
        System.out.println("Press 2 to switch ON/OFF the network globally");    //  pcNetworkSwitch() - HW L10_Singleton
        System.out.println("Press 3 to compare PCs");   //  method pcCompare()  = HW L10_overrided_equals_hashCode
        System.out.println("Press 0 to exit the program");

        boolean cond = true;
        while (cond) {
            System.out.println("\nWhat you want to do?");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            switch (input) {
                case "0":
                    cond = false;  //  exit from the while loop
                    System.out.println("Bye!");
                    break;
                case "1":
                    PCUtils.pcWork(pcList.get(0));  //  calling static method pcWork() from class PCUtils
                    break;
                case "2":
                    PCUtils.pcNetworkSwitch(pcList);  //  calling static method pcNetworkSwitch() from class PCUtils
                    break;
                case "3":
                    PCUtils.pcCompare(pcList);  //  calling static method pcCompare() from class PCUtils
                    break;
                default:
                    System.out.println("Unknown operation. Please try again");   //  Wrong input
            }
        }
    }
}
