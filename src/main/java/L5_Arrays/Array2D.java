package L5_Arrays;//  Домашнее задание 5
//        Добавлено: 13.03.2020 23:30
//        Ознакомиться с вложенными циклами. Ознакомиться с многомерными массивами.
//
//        1. Объявить и наполнить двумерный массив и вывести его содержимое в консоль.

public class Array2D {

    public static void main(String args[]) {

        int height = randomNumber5();   //  высота массива
        int width = randomNumber5();    //  ширина массива
        int[][] arr = createArray(height, width);   //  объявление и заполнение массива
        printArray(arr);    //  вывод массива на экран

    }

//  метод создает 2D-массив случайного размера
//  не более 5 элементов по каждому измерению
//  и заполняет его случайными числами в диапазоне [-50..50]
    public static int[][] createArray (int height, int width) {
        int arr[][] = new int[height][width];
        fillArray(arr);
        return arr;
    }

//  метод заполняет массив случайными целыми числами в диапазоне [-50..50]
//  вызывыется из метода createArray
    public static void fillArray (int[][] arr) {
        int height = arr.length;
        int width = arr[0].length;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                arr[i][j] = randomNumber50();
            }
        }
    }

//  метод выводит 2D-массив на экран
    public static void printArray (int[][] arr) {
        //  размер массива
        int height = arr.length;
        int width = arr[0].length;
        System.out.println("\nРазмер массива: " + width +" x "+ height);
        System.out.println("Случайные числа в диапазоне [1..5]");

        System.out.println("\nЭлементы массива:");
        System.out.println("Случайные числа в диапазоне [-50..50]");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

//  метод возвращает случайное целое число в диапазоне [-50..50]
    public static int randomNumber50() {
        return (int) Math.ceil(Math.random()*100)-50;
    }

//  метод возвращает случайное целое число в диапазоне [1..5]
    public static int randomNumber5() {
        return (int) Math.ceil(Math.random()*4) + 1;
    }

}
