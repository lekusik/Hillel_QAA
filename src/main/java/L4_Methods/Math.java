package L4_Methods;//Домашнее задание 4
//        Добавлено: 08.03.2020 09:19
//        Ознакомиться с Рекурсией, Ознакомиться со списком методов в классе Math
//        на официальном сайте Oracle, создать класс со списком перегруженных методов
//
//        2. Ознакомиться со списком методов в классе Math на официальном сайте Oracle
//        https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html


public class Math {
    public static void main(String[] args) {
        int x = 100;
        int y = 1000;

        double z = 2.4;

//        КОНСТАНТЫ
        System.out.println("\n КОНСТАНТЫ:");
//
//        The double value that is closer than any other to e, the base of the natural logarithms.
//        public static final double E
        System.out.println("E = " + java.lang.Math.E);
//
//        The double value that is closer than any other to pi, the ratio of the circumference of a circle to its diameter.
//        public static final double PI
        System.out.println("PI = " + java.lang.Math.PI);
//
//        РАЗЛИЧНЫЕ АРИФМЕТИЧЕСКИЕ ФУНКЦИИ: МОДУЛЬ, КВАДРАТНЫЙ, КУБИЧЕСКИЙ КОРЕНЬ, МИН, МАКС, РЭНДОМ ИТП
        System.out.println("\n Методы прегружены. Почти все можно вызывать с разными типами данных");
        System.out.println(" РАЗЛИЧНЫЕ АРИФМЕТИЧЕСКИЕ ФУНКЦИИ: МОДУЛЬ, КВАДРАТНЫЙ, КУБИЧЕСКИЙ КОРЕНЬ, МИН, МАКС, РЭНДОМ ИТП:");
//
//        Returns the absolute value of an int value.
//        static int	abs(int a)
        System.out.println("Модуль " + x + " = " + java.lang.Math.abs(x));
//
//        Returns the cube root of a double value.
//        static double	cbrt(double a)
//
//        Returns the correctly rounded positive square root of a double value.
//        static double	sqrt(double a)
        System.out.println("Квадратный корень из " + x + " = " + java.lang.Math.sqrt(x));
//
//        Returns sqrt(x2 +y2) without intermediate overflow or underflow.
//        static double	hypot(double x, double y)
//
//        Returns the greater of two int values.
//        static int	max(int a, int b)
        System.out.println("Из чисел " + x + " и "  + y + " большее: " + java.lang.Math.max(x, y));
//
//        Returns the smaller of two int values.
//        static int	min(int a, int b)
        System.out.println("Из чисел " + x + " и "  + y + " меньшее: " + java.lang.Math.min(x, y));
//
//        Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
//        static double	random()
//
//        ОКРУГЛЕНИЕ (В БОЛЬШУЮ, В МЕНЬШУЮ СТОРОНУ ИТП)
        System.out.println("\n ОКРУГЛЕНИЕ (В БОЛЬШУЮ, В МЕНЬШУЮ СТОРОНУ ИТП):");
//
//        Returns the smallest (closest to negative infinity) double value that is greater than or equal to the argument and is equal to a mathematical integer.
//        static double	ceil(double a)
        System.out.println("Округленное в большую сторону " + z + " = " + java.lang.Math.ceil(z));
//
//        Returns the largest (closest to positive infinity) double value that is less than or equal to the argument and is equal to a mathematical integer.
//        static double	floor(double a)
        System.out.println("Округленное в меньшую сторону " + z + " = " + java.lang.Math.floor(z));
//
//        Returns the closest long to the argument, with ties rounding to positive infinity.
//        static long	round(double a)
//
//        Returns the double value that is closest in value to the argument and is equal to a mathematical integer.
//        static double	rint(double a)
//
//        ПРИКОЛЬНЫЕ ФУНКЦИИ, ВЫБРАСЫВАЮЩИЕ ИСКЛЮЧЕНИЯ (ИНКРИМЕНТ, ДЕКРЕМЕНТ, УМНОЖЕНИЕ, ДЕЛЕНИЕ, СЛОЖЕНИЕ ИТП)
//
//        Returns the argument decremented by one, throwing an exception if the result overflows an int.
//        static int	decrementExact(int a)
//
//        Returns the argument incremented by one, throwing an exception if the result overflows an int.
//        static int	incrementExact(int a)
//
//        Returns the sum of its arguments, throwing an exception if the result overflows an int.
//        static int	addExact(int x, int y)
//
//        Returns the product of the arguments, throwing an exception if the result overflows an int.
//        static int	multiplyExact(int x, int y)
//
//        Returns the negation of the argument, throwing an exception if the result overflows an int.
//        static int	negateExact(int a)
//
//        Returns the difference of the arguments, throwing an exception if the result overflows an int.
//        static int	subtractExact(int x, int y)
//
//        Returns the value of the long argument; throwing an exception if the value overflows an int.
//        static int	toIntExact(long value)
//
//        РАЗЛИЧНЫЕ ТРИГОНОМЕТРИЧЕСКИЕ ФУНКЦИИ
        System.out.println("\n РАЗЛИЧНЫЕ ТРИГОНОМЕТРИЧЕСКИЕ ФУНКЦИИ:");
//
//        Returns the arc sine of a value; the returned angle is in the range -pi/2 through pi/2.
//        static double	asin(double a)
//
//        Returns the arc tangent of a value; the returned angle is in the range -pi/2 through pi/2.
//        static double	atan(double a)
//
//        Returns the angle theta from the conversion of rectangular coordinates (x, y) to polar coordinates (r, theta).
//        static double	atan2(double y, double x)
//
//        Returns the arc cosine of a value; the returned angle is in the range 0.0 through pi.
//        static double	acos(double a)
//
//        Returns the trigonometric cosine of an angle.
//        static double	cos(double a)
        System.out.println("cos(" + x + ") = " + java.lang.Math.cos(x));
//
//        Returns the hyperbolic cosine of a double value.
//        static double	cosh(double x)
//
//        Converts an angle measured in degrees to an approximately equivalent angle measured in radians.
//        static double	toRadians(double angdeg)
//
//        Returns the trigonometric tangent of an angle.
//        static double	tan(double a)
//
//        Returns the hyperbolic tangent of a double value.
//        static double	tanh(double x)
//
//        Converts an angle measured in radians to an approximately equivalent angle measured in degrees.
//        static double	toDegrees(double angrad)
//
//        Returns the trigonometric sine of an angle.
//        static double	sin(double a)
//
//        Returns the hyperbolic sine of a double value.
//        static double	sinh(double x)
//
//        ЛОГАРИФМЫ И ЭКСПОНЕНТЫ
        System.out.println("\n ЛОГАРИФМЫ И ЭКСПОНЕНТЫ");
//
//        Returns Euler's number e raised to the power of a double value.
//        static double	exp(double a)
        System.out.println("e в степени " + x + " = " + java.lang.Math.exp(x));
//
//        Returns ex -1.
//        static double	expm1(double x)
//
//        Returns the unbiased exponent used in the representation of a double.
//        static int	getExponent(double d)
//
//        Returns the natural logarithm (base e) of a double value.
//        static double	log(double a)
        System.out.println("ln(" + x + ") = " + java.lang.Math.log(x));
//
//        Returns the base 10 logarithm of a double value.
//        static double	log10(double a)
//
//        Returns the natural logarithm of the sum of the argument and 1.
//        static double	log1p(double x)
//
//        ИНТЕРЕСНАЯ И ПОЛЕЗНАЯ ФУНКЦИЯ
        System.out.println("\n ИНТЕРЕСНАЯ И ПОЛЕЗНАЯ ФУНКЦИЯ signum(double d)");
        System.out.println("Returns the signum function of the argument; \n zero if the argument is zero,\n 1.0 if the argument is greater than zero,\n -1.0 if the argument is less than zero.");
//
//        static double	signum(double d)
//        Returns the signum function of the argument; zero if the argument is zero, 1.0 if the argument is greater than zero, -1.0 if the argument is less than zero.
        double d = java.lang.Math.ceil(java.lang.Math.random()*100)-50.5; // рэндомное число от -49.5 до 50.5.
        System.out.println(d);
        double signum = java.lang.Math.signum(d);
        switch ((int) signum){
            case -1:
                System.out.println(d + " отрицательное число");
                break;
            case 1:
                System.out.println(d + " положительное число");
                break;
            default:
                System.out.println(d + " равно 0");
        };
    }
}
