package L7_Classes;//  Домашнее задание 7
//        Добавлено: 27.03.2020 21:58
//        Ознакомление с классами
//        1.  Создать клас Ученик с полями, имя, фамилия, возраст,
//            и через this задать ему поля и вывести в консоль эти поля.
//        2.  Создать клас Учитель с полями, имя, фамилия, возраст,
//            и через геттеры и сеттеры задать поля и вывести в консоль эти поля.

public class Student {
    String FName;   //  имя
    String LName;   //  фамилия
    int age;        //  возрвст

    //  конструктор с параметрами
    Student(String FName, String LName, int age) {
        this.FName = FName;
        this.LName = LName;
        this.age = age;
    }

    //  метод, выводящий данные в консоль
    void displayInfo() {
        System.out.println("\nИнформация о студенте:");
        System.out.printf("Имя:\t\t%s\nФамилия:\t%s\nВозраст:\t%d\n", FName, LName, age);
    }
}
