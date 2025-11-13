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
        // Задача 3
        System.out.println("\nЗадача 3");
        int[] inputArray3 = {4500, 6000, 3500, 7000, 5500};
        boolean[] outputArray3 = new boolean[inputArray3.length];

        index = 0;
        for (int bonus : inputArray3) {
            outputArray3[index] = bonus > 5000;
            index++;
        }

        System.out.print("inputArray3: ");
        for (int num : inputArray3) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("outputArray3: ");
        for (boolean flag : outputArray3) {
            System.out.print(flag + " ");
        }
        System.out.println();
        // Задача 4
        System.out.println("\nЗадача 4");
        int[] inputArray4 = {5000, 3000, -1000, 2000, 4000};
        boolean[] outputArray4 = new boolean[1];

        boolean noOverdue = true;
        for (int balance : inputArray4) {
            if (balance < 0) {
                noOverdue = false;
                break;
            }
        }
        outputArray4[0] = noOverdue;

        System.out.print("inputArray4: ");
        for (int num : inputArray4) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("outputArray4: ");
        for (boolean flag : outputArray4) {
            System.out.print(flag + " ");
        }
        System.out.println();
        // Задача 5
        System.out.println("\nЗадача 5");
        int[] inputArray5 = {150000, -50000, 200000, -100000, 180000};
        int[] outputArray5 = new int[1];

        int profitableMonths = 0;
        for (int profit : inputArray5) {
            if (profit > 0) {
                profitableMonths++;
            }
        }
        outputArray5[0] = profitableMonths;

        System.out.print("inputArray5: ");
        for (int num : inputArray5) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("outputArray5: ");
        for (int num : outputArray5) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}