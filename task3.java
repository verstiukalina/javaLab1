import java.util.Scanner;

public class LabThird {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("n = ");
        int n = in.nextInt();

        if (n < 1 || n > 20) {
            System.out.println("n повинно бути від 1 до 20");
            in.close();
            return;
        }

        double[][] a = new double[n][n];
        double[] b = new double[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + (i + 1) + "][" + (j + 1) + "] = ");
                a[i][j] = in.nextDouble();
            }
        }

        for (int i = 0; i < n; i++) {
            double sum = 0;

            for (int j = 0; j < n; j++) {
                sum = sum + a[i][j];
            }

            b[i] = sum / n;
        }

        System.out.println("Вектор B:");
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        in.close();
    }
}