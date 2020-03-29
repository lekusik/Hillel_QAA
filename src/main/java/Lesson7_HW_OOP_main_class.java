//  Домашнее задание 7
//        Добавлено: 27.03.2020 21:58
//        Ознакомление с классами
//        1.  Создать клас Ученик с полями, имя, фамилия, возраст,
//            и через this задать ему поля и вывести в консоль эти поля.
//        2.  Создать клас Учитель с полями, имя, фамилия, возраст,
//            и через геттеры и сеттеры задать поля и вывести в консоль эти поля.

import java.util.Scanner;

//  Основной класс с методом main
public class Lesson7_HW_OOP_main_class {
    public static void main(String[] args) {

        String[] teacherInfo = getInfo("teacher");
        //  Создаем объект класса Teacher, используя конструктор по умолчанию
        Teacher teacher = new Teacher();

        //  Устанавливаем значания полей при помощи сеттеров
        teacher.setFName(teacherInfo[0]);
        teacher.setLName(teacherInfo[1]);
        teacher.setAge(Integer.parseInt(teacherInfo[2]));

        String[] studentInfo = getInfo("student");
        //  Создаем объект класса Student. Используем свой конструктор, принимающий на вход 3 параметра
        Student student = new Student(studentInfo[0], studentInfo[1], Integer.parseInt(studentInfo[2]));

        //  Выводим в консоль информацию об учителе и студенте
        printInfo(teacher, student);
    }

    //  Метод принимает данные с клавиатуры и проверяет их корректность
    //  Возвращает массив, состоящий из 3 строк
    public static String[] getInfo(String role) {
        String whose = "";
        switch (role) {
            case "teacher":
               whose = "учителя";
               break;
            case "student":
                whose = "студента";
                break;
        }
        while (true) {
            //  Ввод данных с клавиатуры
            Scanner sc = new Scanner(System.in);
            System.out.printf("\nВведите, разделяя пробелом, ИМЯ, ФАМИЛИЮ и ВОЗРАСТ (только число) %s\n", whose);
            String input = sc.nextLine();
            String[] info = input.split(" ");

            //  Так как данные вводятся вручную с консоли, то нужно проверить, что там пользователь ввел
            //  Достаточно проверить, что количество элементов в массиве info = 3, и что последний элемент - это число
            if (info.length == 3 && isInteger(info[2])) {
                return info;
            } else {
                System.out.println("Вы ввели некорректные данные. Попробуйте снова");   //  неправильный ввод
            }
        }
    }

    //  Метод проверяет, парсится ли string в integer
    //  Возвращает true, если да и false, если нет
    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }

    //  Метод выводит информацию о учителе и студенте в консоль
    //  Ничего не возвращает
    public static void printInfo (Teacher teacher, Student student) {
        //  Достаем значения полей при помощи геттеров (для учителя)
        String tFName = teacher.getFName();
        String tLName = teacher.getLName();
        int tAge = teacher.getAge();

        //  Выводим информацию об учителе на консоль
        System.out.println("\nИнформация об учителе:");
        System.out.printf("Имя:\t\t%s\nФамилия:\t%s\nВозраст:\t%d\n", tFName, tLName, tAge);

        //  Выводим информацию о студенте на экран при помощи метода displayInfo();
        student.displayInfo();

        //  Достаем значения, обращаясь напрямую к полям
        String sFName = student.FName;
        String sLName = student.LName;
        int sAge = student.age;

        //  Вывод общей инфы
        String output = String.format("\nСтудент %s %s (%d) учится у учителя %s %s (%d).",sFName,sLName,sAge,tFName,tLName,tAge);
        System.out.println(output);
    }
}
