package L4_Methods;//Домашнее задание 4
//        Добавлено: 08.03.2020 09:19
//        Ознакомиться с Рекурсией, Ознакомиться со списком методов в классе Math
//        на официальном сайте Oracle, создать класс со списком перегруженных методов
//
//        3. Создать класс со списком перегруженных методов и переменных на каждую
//        математическую операцию " + ", " - ", " * ", " / ",
//        часть с идентификатором static и часть без него
//        (пробуйте содавать обьекты этого класса и запускать
//        методы через использование обьекта "object.methodName...")
//        и запустить их на выполнение в основном классе.


//      Overloaded методы (static и без него) описаны в отдельных классах:
//      Lesson4_HW_Overloaded_Methods.Sum, Lesson4_HW_Overloaded_Methods.Sub, Lesson4_HW_Overloaded_Methods.Mult, Lesson4_HW_Overloaded_Methods.Div
//      Этот класс - основной для работы с калькулятором

public class Calc {
    public static void main(String[] args) {

//  объявление переменных
        int x1 = 100;
        int x2 = 5;
        int x3 = 2;

        double y1 = 35.5;
        double y2 = 7.1;

//  создание экземпляра классов для вызова методов экземпляра класса
        Sum l4hSum = new Sum();
        Sub l4hSub = new Sub();
        Mult l4hMult = new Mult();
        Div l4hDiv = new Div();

//  вызов методов экземпляра класса
        System.out.println("\n Вызов методов экземпляра класса:");

        int intSumResult = l4hSum.sum(x1, x2); // метод принимает 2 int значения
        System.out.println(x1 + " + " + x2 + " = " + intSumResult);
        double doubleSumResult = l4hSum.sum(y1, y2); // метод принимает 2 double значения
        System.out.println(y1 + " + " + y2 + " = " + doubleSumResult);
        System.out.println();

        int intSubResult = l4hSub.sub(x1, x2); // метод принимает 2 int значения
        System.out.println(x1 + " - " + x2 + " = " + intSubResult);
        double doubleSubResult = l4hSub.sub(y1, y2); // метод принимает 2 double значения
        System.out.println(y1 + " - " + y2 + " = " + doubleSubResult);
        System.out.println();

        int intMultResult = l4hMult.mult(x1, x2); // метод принимает 2 int значения
        System.out.println(x1 + " * " + x2 + " = " + intMultResult);
        double doubleMultResult = l4hMult.mult(y1, y2); // метод принимает 2 double значения
        System.out.println(y1 + " * " + y2 + " = " + doubleMultResult);
        System.out.println();

        int intDivResult = l4hDiv.div(x1, x2); // метод принимает 2 int значения
        System.out.println(x1 + " / " + x2 + " = " + intDivResult);
        double doubleDivResult = l4hDiv.div(y1, y2); // метод принимает 2 double значения
        System.out.println(y1 + " / " + y2 + " = " + doubleDivResult);

//  вызов статических методов
        System.out.println("\n Вызов статических методов:");

        int staticIntSumResult = Sum.sum(x1, x2, x3); // метод принимает 3 int значения
        System.out.println(x1 + " + " + x2 + " + " + x3 + " = " + staticIntSumResult);

        int staticIntSubResult = Sub.sub(x1, x2, x3); // метод принимает 3 int значения
        System.out.println(x1 + " - " + x2 + " - " + x3 + " = " + staticIntSubResult);

        int staticIntMultResult = Mult.mult(x1, x2, x3); // метод принимает 3 int значения
        System.out.println(x1 + " * " + x2 + " * " + x3 + " = " + staticIntMultResult);

        int staticIntDivResult = Div.div(x1, x2, x3); // метод принимает 3 int значения
        System.out.println(x1 + " / " + x2 + " / " + x3 + " = " + staticIntDivResult);

    }
}


