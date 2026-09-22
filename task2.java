import java.util.Scanner;

public class LabSecond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("n = ");
        int n = in.nextInt();

        if (n < 1 || n > 200) {
            System.out.println("n повинно бути від 1 до 200");
            in.close();
            return;
        }

        double[] a = new double[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            System.out.print("A[" + (i + 1) + "] = ");
            a[i] = in.nextDouble();
        }

        double sumFirst = 0;
        for (int i = 0; i < n; i++) {
            sumFirst = sumFirst + a[i];
        }

        double average = sumFirst / n;
        double result = 0;

        for (int i = n; i < 2 * n; i++) {
            if (a[i] > average) {
                result = result + a[i];
            }
        }

        System.out.println("Середнє арифметичне = " + average);
        System.out.println("Сума потрібних елементів = " + result);

        in.close();
    }
}