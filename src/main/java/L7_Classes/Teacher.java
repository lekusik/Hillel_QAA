package L7_Classes;//  Домашнее задание 7
//        Добавлено: 27.03.2020 21:58
//        Ознакомление с классами
//        1.  Создать клас Ученик с полями, имя, фамилия, возраст,
//            и через this задать ему поля и вывести в консоль эти поля.
//        2.  Создать клас Учитель с полями, имя, фамилия, возраст,
//            и через геттеры и сеттеры задать поля и вывести в консоль эти поля.

public class Teacher {
    String FName;   //  имя
    String LName;   //  фамилия
    int age;        //  возрвст

//  геттеры и сеттеры для заполения полей класса
    void setFName(String FName) { this.FName = FName; }
    String getFName() { return FName; }

    void setLName(String LName) { this.LName = LName; }
    String getLName() { return LName; }

    void setAge(int age) { this.age = age; }
    int getAge() { return age; }
}
