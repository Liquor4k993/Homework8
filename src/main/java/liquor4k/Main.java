package liquor4k;

public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1");
        int[] inputArray1 = {15000, 20000, 18000, 22000, 19000};
        float[] outputArray1 = new float[4];

        // Сумма
        float sum = 0;
        for (int payment : inputArray1) {
            sum += payment;
        }
        outputArray1[0] = sum;

        // Максимум
        int max = inputArray1[0];
        for (int payment : inputArray1) {
            if (payment > max) {
                max = payment;
            }
        }
        outputArray1[1] = max;

        // Минимум
        int min = inputArray1[0];
        for (int payment : inputArray1) {
            if (payment < min) {
                min = payment;
            }
        }
        outputArray1[2] = min;

        // Среднее
        outputArray1[3] = sum / inputArray1.length;

        System.out.print("inputArray1: ");
        for (int num : inputArray1) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("outputArray1: ");
        for (float num : outputArray1) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Задача 2
        System.out.println("\nЗадача 2");
        int[] inputArray2 = {50000, 75000, 60000, 80000, 65000};
        float[] outputArray2 = new float[inputArray2.length];

        int index = 0;
        for (int salary : inputArray2) {
            outputArray2[index] = salary * 0.13f;
            index++;
        }

        System.out.print("inputArray2: ");
        for (int num : inputArray2) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("outputArray2: ");
        for (float num : outputArray2) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}