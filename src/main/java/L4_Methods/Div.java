package L4_Methods;

// Overloaded DIV methods
public class Div {

    // Overloaded div(). This sum takes two int parameters
    public int div(int x, int y)
    {
        return (x / y);
    }

    // Overloaded div(). This sum takes two double parameters
    public double div(double x, double y)
    {
        return (x / y);
    }

    // Overloaded div(). This sum takes three int parameters
    // Static method
    public static int div(int x, int y, int z)
    {
        return (x / y / z);
    }
}
