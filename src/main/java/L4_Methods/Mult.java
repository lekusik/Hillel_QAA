package L4_Methods;

// Overloaded MULT methods
public class Mult {

    // Overloaded mult(). This sum takes two int parameters
    public int mult(int x, int y)
    {
        return (x * y);
    }

    // Overloaded mult(). This sum takes two double parameters
    public double mult(double x, double y)
    {
        return (x * y);
    }

    // Overloaded mult(). This sum takes three int parameters
    // Static method
    public static int mult(int x, int y, int z)
    {
        return (x * y * z);
    }
}
