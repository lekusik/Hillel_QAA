//Домашнее задание 6
//        Добавлено: 22.03.2020 00:43
//        2. Вывести строку в обратном порядке.
//        Вывести строку в обратном порядке используя знания о строках и массивах,
//        и циклах(строку можно выбрать любую на ваш выбор).

import java.util.Scanner;

public class Lesson6_HW_String_Reverse {

    public static void main(String[] args) {

//  Reading string value
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPlease, enter any text");
        String originalText = sc.nextLine();

//  Reversing and printing the text (using static function reversedText)
        String reversedText = textReversing(originalText);
        System.out.printf("\nYour text in reverse order:\n%s\n", reversedText);
    }

//  Static function. Takes original text and returns its reversed version
    public static String textReversing (String input) {
        String output = "";
        char[] letters = input.toCharArray();
        for (int i = letters.length - 1; i >= 0; i--) {
            output += letters[i];
        }
        return output;
    }
}
