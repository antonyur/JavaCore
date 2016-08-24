package module2;

public class Task1Class {

    private static int sum(int[] array) {
        int s = 0;
        for (int a : array) {
            s += a;
        }
        return s;
    }

    private static double sum(double[] array) {
        double s = 0;
        for (double a : array) {
            s += a;
        }
        return s;
    }

    private static int min(int[] array)
    {
        int m = Integer.MAX_VALUE;
        for (int a : array) {
            if (a < m)
                m = a;
        }

        return m;
    }

    private static double min(double[] array)
    {
        double m = Double.MAX_VALUE;
        for (double a : array) {
            if (a < m)
                m = a;
        }

        return m;
    }

    private static int max(int[] array)
    {
        int m = Integer.MIN_VALUE;
        for (int a : array) {
            if (a > m)
                m = a;
        }

        return m;
    }

    private static double max(double[] array)
    {
        double m = Double.MIN_VALUE;
        for (double a : array) {
            if (a > m)
                m = a;
        }

        return m;
    }

    private static int maxPositive(int[] array)
    {
        int m = -1;
        for (int a : array) {
            if (a > 0 && a > m)
                m = a;
        }

        return m;
    }

    private static double maxPositive(double[] array)
    {
        double m = -1.0;
        for (double a : array) {
            if (a > 0 && a > m)
                m = a;
        }

        return m;
    }

    private static long multiplication(int[] array) {
        int m = 1;
        for (int a : array) {
            m *= a;
        }
        return m;
    }

    private static double multiplication(double[] array) {
        double m = 1;
        for (double a : array) {
            m *= a;
        }
        return m;
    }

    private static int modulus(int[] array) {
        int m;
        m = array[0] % array[array.length - 1];
        return m;
    }

    private static double modulus(double[] array) {
        double m;
        m = array[0] % array[array.length - 1];
        return m;
    }

    private static int secondLargest(int[] array) {
        int m = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;
        for (int a : array) {
            if (a > m) {
                if (m > Integer.MIN_VALUE)
                    sl = m;
                m = a;
            }
        }

        return sl;
    }

    private static double secondLargest(double[] array) {
        double m = Double.MIN_VALUE;
        double sl = Double.MIN_VALUE;
        for (double a : array) {
            if (a > m) {
                if (m > Double.MIN_VALUE)
                    sl = m;
                m = a;
            }
        }

        return sl;
    }

    public static void main(String[] args) {
        int[] a = {2,14,-3,18,-9,5,6,2};
        double[] d = {5.0,14.34,-3.12,18,-9.5,512313123,-13123,2};
        System.out.println(String.format("int array %s: ","{2,14,-3,18,-9,5,6,2}"));
        System.out.println(String.format("double array %s: ","{2.0,14.34,-3.12,18,-9.5,512313123,-13123,2}"));

        System.out.println(String.format("sum int %d",sum(a)));
        System.out.println(String.format("sum double %f",sum(d)));
        System.out.println(String.format("max int %d",max(a)));
        System.out.println(String.format("max double %f",max(d)));
        System.out.println(String.format("min int %d",min(a)));
        System.out.println(String.format("min double %f",min(d)));
        System.out.println(String.format("mult int %d",multiplication(a)));
        System.out.println(String.format("mult double %f",multiplication(d)));
        System.out.println(String.format("modulus int %d",modulus(a)));
        System.out.println(String.format("modulus double %f", modulus(d)));
        System.out.println(String.format("maxPositive int %d",maxPositive(a)));
        System.out.println(String.format("maxPositive double %f", maxPositive(d)));
        System.out.println(String.format("secondLargest int %d",secondLargest(a)));
        System.out.println(String.format("secondLargest double %f",secondLargest(d)));
    }
}
