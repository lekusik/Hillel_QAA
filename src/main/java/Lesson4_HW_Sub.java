// Overloaded SUB methods
public class Lesson4_HW_Sub {

    // Overloaded sub(). This sum takes two int parameters
    public int sub(int x, int y)
    {
        return (x - y);
    }

    // Overloaded sub(). This sum takes two double parameters
    public double sub(double x, double y)
    {
        return (x - y);
    }

    // Overloaded sub(). This sum takes three int parameters
    // Static method
    public static int sub(int x, int y, int z)
    {
        return (x - y - z);
    }
}
