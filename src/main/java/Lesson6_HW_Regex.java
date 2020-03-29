//  Домашнее задание 6
//      Добавлено: 22.03.2020 00:43
//      1.  Регулярные выражения (RegEx).
//          Ознакомиться с регулярными выражениями.
//          Разбиралась на примере валидации имейлов с "выкусыванием" именованных скобочных групп

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson6_HW_Regex{

    public static void main(String[] args) {

//  Regular expression to check correct emails
//  Capturing Groups <name> and <domain>
        String regex = "(?<name>^[\\w]+([.+-]*[\\w]+)*)@(?<domain>[a-zA-Z0-9]+(-[a-zA-Z0-9]+)*(\\.[a-zA-Z0-9]+)+$)";

//  Compiling the regular expression
        Pattern fullPattern = Pattern.compile(regex);

        while (true) {
//  Reading string value
            Scanner sc = new Scanner(System.in);
            System.out.println("\nPlease, enter your email address");
            String input = sc.nextLine();

//Retrieving the matcher object
            Matcher matcher = fullPattern.matcher(input);

//verifying whether match occurred
            if (matcher.find()) {
                String name = matcher.group("name");
                String domain = matcher.group("domain");
                System.out.printf("\nThank you, %s!\nEmail %s looks correct.\nYour domain is %s.\n", name, input, domain);
                break;
            } else {
                System.out.println("Given email address is not correct. Try again");
            }
        }
    }
}