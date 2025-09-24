public class Main {
    public static void main(String[] args) {
        RationalNumber r1 = new RationalNumber(3, 4);
        RationalNumber r2 = new RationalNumber(2, 5);

        System.out.println("R1: " + r1);
        System.out.println("R2: " + r2);

        System.out.println("Add: " + r1.add(r2));
        System.out.println("Subtract: " + r1.subtract(r2));
        System.out.println("Multiply: " + r1.multiply(r2));
        System.out.println("Divide: " + r1.divide(r2));
    }
}
