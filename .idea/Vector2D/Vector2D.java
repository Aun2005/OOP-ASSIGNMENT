public class Vector2D {
    private double x;
    private double y;

    // Constructor
    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Vector addition
    public Vector2D add(Vector2D other) {
        return new Vector2D(this.x + other.x, this.y + other.y);
    }

    // Vector subtraction
    public Vector2D subtract(Vector2D other) {
        return new Vector2D(this.x - other.x, this.y - other.y);
    }

    // Dot product
    public double dot(Vector2D other) {
        return this.x * other.x + this.y * other.y;
    }

    // Magnitude (length of the vector)
    public double magnitude() {
        return Math.sqrt(x * x + y * y);
    }

    // Normalize (unit vector)
    public Vector2D normalize() {
        double mag = magnitude();
        if (mag == 0) {
            throw new ArithmeticException("Cannot normalize a zero vector.");
        }
        return new Vector2D(x / mag, y / mag);
    }

    // Scale by a scalar
    public Vector2D scale(double scalar) {
        return new Vector2D(x * scalar, y * scalar);
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
