import static java.lang.Math.*;

public class Main {
    public static double f1(double x) {
        return (pow(E, cos(pow(x, (1.0 / 3.0)))));
    }

    public static double f2(double x) {
        double r = 3.0 / 4.0;
        return (pow(sin(pow(x - 1.0, 3.0)), r / atan(1.0 / pow(E, abs(x)))));
    }

    public static double f3(double x) {
        double k = 1.0 / 3.0;
        return (pow(pow(pow((log(abs(x))) / (2.0 / 3.0) + pow(x, 2), (pow(x, k) / 2)), pow(x, x)), k));
    }

    public static double rd() {
        return (random() * 6.0 - 2.0);
    }

    public static void main(String[] agrs) {

        int[] a;
        double[] x;
        double[][] d;
        int cnt;

        a = new int[19];
        x = new double[13];
        d = new double[10][13];
        cnt = 6;

        for (int i = 18; i > -1; --i) {
            a[i] = i + cnt;
        }
        for (int i = 0; i < 13; ++i) {
            x[i] = rd();
        }
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < 13; ++j) {
                if (a[i] == 18) {
                    d[i][j] = f1(x[j]);
                } else if (a[i] == 6 || a[i] == 8 || a[i] == 12 || a[i] == 14 || a[i] == 22) {
                    d[i][j] = f2(x[j]);
                } else {
                    d[i][j] = f3(x[j]);
                }
            }
        }
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < 13; ++j) {
                System.out.printf("%20.3f", d[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");

        }
    }
}

