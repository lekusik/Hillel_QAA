//  Домашнее задание 3
//      Добавлено: 02.03.2020 23:17
//      Знакомство с логическими операторами, условные конструкции
//      if/else, if/elseif/else, switch/case, ternary operator.
//
//      3) Доп задание для продвинутых: описать математические операции над некоторыми числами
//      ввиде калькулятора и вывести их на консоль.

public class Lesson3_HW_calc {
    public static void main(String[] args) {
//  объявление переменных
        int x1 = 100;
        int x2 = 5;
        char op1 = '+';
        char op2 = '-';
        char op3 = '*';
        char op4 = '/';

//  вызов метода calc с разными значениями
        System.out.println("===");
        System.out.println("Результаты расчета:");
        System.out.println("===");
        calc(x1, x2, op1);
        calc(x1, x2, op2);
        calc(x1, x2, op3);
        calc(x1, x2, op4);
    }

//  Методы, описывающие 4 простых математических операции
//  Вызываются в методе main
//  По уму нужно было бы сделать:
//  1. Ввод с клавиатуры, парсить стрингу в инт и чар
//  2. Обрабатывать исключения (деление на ноль, переполнение переменной итп)
//  но не буду заморачиваться :))

//  метод возвращает результат сложения 2 целых чисел
    public static int add(int x1, int x2) {
        int result = x1 + x2;
        return result;
    }

//  метод возвращает результат вычитания 2 целых чисел
    public static int substract(int x1, int x2) {
        int result = x1 - x2;
        return result;
    }

//  метод возвращает результат умножения 2 целых чисел
    public static int multiply(int x1, int x2) {
        int result = x1 * x2;
        return result;
    }

//  метод возвращает результат деления 2 целых чисел
    public static int divide(int x1, int x2) {
        int result = x1 / x2;
        return result;
    }

//  метод расчета (выбор математической операции)
    public static void calc(int x1, int x2, char operation) {
        int result = 0;
        switch (operation){
        case '+':
            result = add(x1, x2);
            break;
        case '-':
            result = substract(x1, x2);
            break;
        case '*':
            result = multiply(x1, x2);
            break;
        case '/':
            result = divide(x1, x2);
            break;
        default:
            System.out.println("unknown operation");
        };
        System.out.println(x1 + " " + operation + " " + x2 + " = " + result);
        System.out.println("===");
    }
}
