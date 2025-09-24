public class Main {
    public static void main(String[] args) {
        Vector2D v1 = new Vector2D(3, 4);
    Vector2D v2 = new Vector2D(1, 2);

        System.out.println("v1: " + v1);
        System.out.println("v2: " + v2);
        System.out.println("Add: " + v1.add(v2));
        System.out.println("Subtract: " + v1.subtract(v2));
        System.out.println("Dot product: " + v1.dot(v2));
        System.out.println("Magnitude of v1: " + v1.magnitude());
        System.out.println("Normalized v1: " + v1.normalize());
        System.out.println("v1 scaled by 2: " + v1.scale(2));
    }
}
