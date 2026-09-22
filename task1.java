import java.util.Scanner;

public class LabFirst {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("1. Дійсні вхідні дані, дійсний результат");
        System.out.print("a = ");
        double a1 = in.nextDouble();
        System.out.print("b = ");
        double b1 = in.nextDouble();

        double result1 = (a1 * b1 - (a1 + b1) * (a1 - b1))
                / (Math.pow(b1, 4) + Math.pow(a1, 3)) + 5 * b1;
        System.out.println("Результат = " + result1);

        System.out.println("\n2. Цілі вхідні дані, дійсний результат");
        System.out.print("a = ");
        int a2 = in.nextInt();
        System.out.print("b = ");
        int b2 = in.nextInt();

        double result2 = (double) (a2 * b2 - (a2 + b2) * (a2 - b2))
                / (Math.pow(b2, 4) + Math.pow(a2, 3)) + 5 * b2;
        System.out.println("Результат = " + result2);

        System.out.println("\n3. Дійсні вхідні дані, цілий результат");
        System.out.print("a = ");
        double a3 = in.nextDouble();
        System.out.print("b = ");
        double b3 = in.nextDouble();

        int result3 = (int) ((a3 * b3 - (a3 + b3) * (a3 - b3))
                / (Math.pow(b3, 4) + Math.pow(a3, 3)) + 5 * b3);
        System.out.println("Результат = " + result3);

        in.close();
    }
}