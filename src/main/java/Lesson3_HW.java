//  Домашнее задание 3
//      Добавлено: 02.03.2020 23:17
//      Знакомство с логическими операторами, условные конструкции
//      if/else, if/elseif/else, switch/case, ternary operator.
//
//      1) Обьявить четыре разных числа, сравнить их и вывести на консоль наименьшее.
//      2) Обявить несколько из них одинаковых, вывести на консоль сколько одинаковых чисел в наборе.

public class Lesson3_HW {
    public static void main(String[] args) {
//      1) Обьявить четыре разных числа, сравнить их и вывести на консоль наименьшее.
//      для решения этой задачи достаточно только if-ов. Хотя циклом было бы удобнее :))
        int x1 = 100;
        int x2 = -325;
        int x3 = 0;
        int x4 = 25;
        int min = x1;

        if (x2 <= min) {
            min = x2;
        };
        if (x3 <= min) {
            min = x3;
        };
        if (x4 <= min) {
            min = x4;
        };
        System.out.println("===");
        System.out.println("Минимальное значение из: " + x1 + ", " + x2 + ", " + x3 + ", " + x4 + " равно " + min);

//      2) Обявить несколько из них одинаковых, вывести на консоль сколько одинаковых чисел в наборе.
//      опять же для решения этой задачи достаточно только if-ов. Хотя циклом было бы удобнее :))
        int y1 = 100;
        int y2 = 25;
        int y3 = 0;
        int y4 = 25;
        int counter1 = 1;
        int counter2 = 1;
        int counter3 = 1;
        int counter4 = 1;
        System.out.println("===");
        System.out.println("Среди цифр: " + y1 + ", " + y2 + ", " + y3 + ", " + y4 + " есть:");

        if (counter1 > 0 && y1 == y2) {
            counter1++;
            counter2 = -1;
        };
        if (counter1 > 0 && y1 == y3) {
            counter1++;
            counter3 = -1;
        };
        if (counter1 > 0 && y1 == y4) {
            counter1++;
            counter4 = -1;
        };
        if (counter2 > 0 && y2 == y3) {
            counter2++;
            counter3 = -1;
        };
        if (counter2 > 0 && y2 == y4) {
            counter2++;
            counter4 = -1;
        };
        if (counter3 > 0 && y3 == y4) {
            counter3++;
            counter4 = -1;
        };
        if (counter1 > 0) {
            System.out.println(counter1 + " цифр(а/ы) " + y1);
        };
        if (counter2 > 0) {
            System.out.println(counter2 + " цифр(а/ы) " + y2);
        };
        if (counter3 > 0) {
            System.out.println(counter3 + " цифр(а/ы) " + y3);
        };
        if (counter4 > 0) {
            System.out.println(counter4 + " цифр(а/ы) " + y4);
        };
        System.out.println("===");
    }
}
