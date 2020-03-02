//  Домашнее задание 2
//        Добавлено: 29.02.2020 10:21
//        Типы данных, инкрементирование/декрементирование,
//        1) Создать новй проект и обьявить в нем 8 типов данных(просмотреть презентацию в прикриплении
//        и также будет полезно погуглить инфу).
//
//        обьявить две переменные с заданным значением и произвести с ними математические
//        действия: "+", "-", " * ", "/" ;
//        провести инкремент и декремент любой выбранной переменной(детали по инкр/декр пересмотреть в прикрепленной
//        презентации а также будет полезно погуглить);
//        попробовать разобраться с оператором " % " ;
//        2) Разобраться с переменной типа char;
//
//        3) Зарегистрировать аккаунт на гитхабе (Если уже знаете как в него добавлять файлы то можно в этот файл
//        скопировать код вашей "программы" и линку приатачить в решении задания);

public class Lesson2_HW {
    public static void main(String[] args) {

//  объявление переменных
        byte byteA, byteB;          // byte (целые числа, 1 байт)
        short shortA, shortB;       // short (целые числа, 2 байта)
        int intA, intB;             // int (целые числа, 4 байта)
        long longA, longB;          // long (целые числа, 8 байтов)
        float floatA, floatB;       // float (вещественные числа, 4 байта)
        double doubleA, doubleB;    // double (вещественные числа, 8 байтов)
        char charA, charB;          // char (символ Unicode, 2 байта)
        boolean booleanA, booleanB; // boolean (значение истина/ложь, 1 байт)

        byte byteSum, byteSub, byteMult, byteDiv, byteMod;
        short shortSum, shortSub, shortMult, shortDiv, shortMod;
        int intSum, intSub, intMult, intDiv, intMod;
        long longSum, longSub, longMult, longDiv, longMod;
        float floatSum, floatSub, floatMult, floatDiv, floatMod;
        double doubleSum, doubleSub, doubleMult, doubleDiv, doubleMod;
        char charSum, charSub, charMult, charDiv, charMod;

//  инициализация переменных типа byte
        byteA = 5;
        byteB = 2;
//  арифметические операции с переменными
        byteSum = (byte) (byteA + byteB);   // требутся приведение типов
        byteSub = (byte) (byteA - byteB);
        byteMult = (byte) (byteA * byteB);
        byteDiv = (byte) (byteA / byteB);
        byteMod = (byte) (byteA % byteB);   // остаток от деления
//  выведение результатов в консоль
        System.out.println("Арифметические действия с переменными типа byte");
        System.out.println("byteA = " + byteA);
        System.out.println("byteB = " + byteB);
        System.out.println("Addition = " + byteSum);
        System.out.println("Substraction = " + byteSub);
        System.out.println("Multiplication = " + byteMult);
        System.out.println("Division = " + byteDiv);
        System.out.println("Modulo = " + byteMod);
        System.out.println("----------");

//  инициализация переменных типа short
        shortA = 50;
        shortB = 7;
//  арифметические операции с переменными
        shortSum = (short) (shortA + shortB);   // требутся приведение типов
        shortSub = (short) (shortA - shortB);
        shortMult = (short) (shortA * shortB);
        shortDiv = (short) (shortA / shortB);
        shortMod = (short) (shortA % shortB);   // остаток от деления
//  выведение результатов в консоль
        System.out.println("Арифметические действия с переменными типа short");
        System.out.println("shortA = " + shortA);
        System.out.println("shortB = " + shortB);
        System.out.println("Addition = " + shortSum);
        System.out.println("Substraction = " + shortSub);
        System.out.println("Multiplication = " + shortMult);
        System.out.println("Division = " + shortDiv);
        System.out.println("Modulo = " + shortMod);
        System.out.println("----------");

//  инициализация переменных типа int
        intA = 1000;
        intB = 205;
        intSum = intSub = intMult = intDiv = intMod = intA; // для использования операций присвоения
//  арифметические операции с переменными
        intSum += intB;
        intSub -= intB;
        intMult *= intB;
        intDiv /= intB;
        intMod %= intB;   // остаток от деления
//  выведение результатов в консоль
        System.out.println("Арифметические действия с переменными типа int с использованием операций присвоения");
        System.out.println("intA = " + intA);
        System.out.println("intB = " + intB);
        System.out.println("Addition = " + intSum);
        System.out.println("Substraction = " + intSub);
        System.out.println("Multiplication = " + intMult);
        System.out.println("Division = " + intDiv);
        System.out.println("Modulo = " + intMod);
        System.out.println("----------");

//  инициализация переменных типа long
        longA = 5000;
        longB = 204;
//  арифметические операции с переменными
        longSum = longA + longB;
        longSub = longA - longB;
        longMult = longA * longB;
        longDiv = longA / longB;
        longMod = longA % longB;   // остаток от деления
//  выведение результатов в консоль
        System.out.println("Арифметические действия с переменными типа long");
        System.out.println("longA = " + longA);
        System.out.println("longB = " + longB);
        System.out.println("Addition = " + longSum);
        System.out.println("Substraction = " + longSub);
        System.out.println("Multiplication = " + longMult);
        System.out.println("Division = " + longDiv);
        System.out.println("Modulo = " + longMod);
        System.out.println("----------");

//  инициализация переменных типа float
        floatA = 56;
        floatB = 27;
//  арифметические операции с переменными
        floatSum = floatA + floatB;
        floatSub = floatA - floatB;
        floatMult = floatA * floatB;
        floatDiv = floatA / floatB;
        floatMod = floatA % floatB;   // остаток от деления - возможно неточное значение, тк float
//  выведение результатов в консоль
        System.out.println("Арифметические действия с переменными типа float");
        System.out.println("floatA = " + floatA);
        System.out.println("floatB = " + floatB);
        System.out.println("Addition = " + floatSum);
        System.out.println("Substraction = " + floatSub);
        System.out.println("Multiplication = " + floatMult);
        System.out.println("Division = " + floatDiv);
        System.out.println("Modulo = " + floatMod);
        System.out.println("----------");

//  инициализация переменных типа double
        doubleA = 56.5;
        doubleB = 27.4;
//  арифметические операции с переменными
        doubleSum = doubleA + doubleB;
        doubleSub = doubleA - doubleB;
        doubleMult = doubleA * doubleB;
        doubleDiv = doubleA / doubleB;
        doubleMod = doubleA % doubleB;   // остаток от деления - возможно неточное значение, тк double
//  выведение результатов в консоль
        System.out.println("Арифметические действия с переменными типа double");
        System.out.println("doubleA = " + doubleA);
        System.out.println("doubleB = " + doubleB);
        System.out.println("Addition = " + doubleSum);
        System.out.println("Substraction = " + doubleSub);
        System.out.println("Multiplication = " + doubleMult);
        System.out.println("Division = " + doubleDiv);
        System.out.println("Modulo = " + doubleMod);
        System.out.println("----------");

//  инициализация переменных типа char
        charA = 'b';
        charB = '\u0061'; //    unicode
//  арифметические операции с переменными
//  примитивный тип char, над которым возможны все те же самые операции, что и над другими целочисленными типами
        charSum = (char) (charA + charB);
        charSub = (char) (charA - charB);
        charMult = (char) (charA * charB);
        charDiv = (char) (charA / charB);
        charMod = (char) (charA % charB);   // остаток от деления
//  выведение результатов в консоль
        System.out.println("Тип char: возможны все те же операции, что и над другими целочисленными типами");
        System.out.println("charA = " + charA);
        System.out.println("charB = " + charB);
        System.out.println("Addition = " + charSum);
        System.out.println("Substraction = " + charSub);
        System.out.println("Multiplication = " + charMult);
        System.out.println("Division = " + charDiv);
        System.out.println("Modulo = " + charMod);
        System.out.println("----------");

//  инициализация переменных типа boolean
        booleanA = true;
        booleanB = false;
//  арифметические операции с переменными boolean типа не возможны
//  выведение результатов в консоль
        System.out.println("Арифметические действия с переменными типа boolean не возможны");
        System.out.println("booleanA = " + booleanA);
        System.out.println("booleanB = " + booleanB);
        System.out.println("----------");

//  increment and decrement
        int a = 1;
        System.out.println("a = " + a);
        int incrA = ++a;
        System.out.println("Incremented to " + incrA);
        int b = 10;
        System.out.println("b = " + b);
        int decrB = --b;
        System.out.println("Decremented to " + decrB);
    }
}