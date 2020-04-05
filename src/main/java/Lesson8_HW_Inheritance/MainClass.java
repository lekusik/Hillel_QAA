package Lesson8_HW_Inheritance;

import java.io.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class MainClass {

    public static void main(String[] args) {

        //  JSON parser object to parse file
        JSONParser jsonParser = new JSONParser();

        //  Read file from resources
        InputStreamReader reader = new InputStreamReader(MainClass.class.getResourceAsStream("timeLords.json"));
        try {
            //  Parse JSON file
            Object obj = jsonParser.parse(reader);

            JSONObject timeLordsList = (JSONObject) obj;
            //  Get Doctors list within timeLords list
            JSONArray doctorsList = (JSONArray) timeLordsList.get("doctor");
            //  Get Masters list within timeLords list
            JSONArray mastersList = (JSONArray) timeLordsList.get("master");

            //  Iterate over all Doctors and Masters (each Doctor has his own Master. 4 cycles)
            int size = doctorsList.size();
            for (int i = 0; i < size; i++ ) {
                System.out.printf("\n%s cycle:\n", (i+1));

                //  Get Doctor's incarnation
                JSONObject doctorObj = (JSONObject) doctorsList.get(i);
                String doctorName = (String) doctorObj.get("incarnation") + " Doctor";

                //  Create a Doctor object
                Doctor doctor = new Doctor(doctorName, (String) doctorObj.get("gender"), (String) doctorObj.get("face"),
                        (String) doctorObj.get("hair"), (String) doctorObj.get("clothes"), (String) doctorObj.get("motto"),
                        (String) doctorObj.get("companion"), (String) doctorObj.get("lastwords"));

                // calling doctor's methods
                doctor.sayHello();
                doctor.lookAtMe();
                doctor.eat();

                //  Get Master's incarnation
                JSONObject masterObj = (JSONObject) mastersList.get(i);
                String masterName = "Master " + (String) masterObj.get("incarnation");

                //  Create a Master object
                Master master = new Master(masterName, (String) masterObj.get("gender"), (String) masterObj.get("face"),
                        (String) masterObj.get("hair"), (String) masterObj.get("clothes"), (String) masterObj.get("motto"));

                // calling master's methods
                master.sayHello();
                master.lookAtMe();
                master.eat();

                System.out.println("===");
                master.doSomething();
                doctor.doSomething();

                System.out.println("===");
                master.regenerate();
                doctor.regenerate();

                System.out.println("===================");
            }
        }
        catch (FileNotFoundException e) { e.printStackTrace(); }
        catch (IOException e) { e.printStackTrace(); }
        catch (ParseException e) { e.printStackTrace(); }
    }
}
