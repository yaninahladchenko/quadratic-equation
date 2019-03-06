public class QuadraticEquation {
    public static void main(String[] args) {
        double a = 10;
        double b = 20;
        double c = 30;

        double x1 = (-b + Math.sqrt(Math.abs(b * b - 4 * a * c))) / (2 * a);
        System.out.println(x1);

        double x2 = (-b - Math.sqrt(Math.abs(b * b - 4 * a * c))) / (2 * a);
        System.out.println(x2);
    }
}
