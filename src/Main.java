public class Main {
    public static void main(String[] args) {

        task1();/*
        task2();
        task3();
        task4();*/

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Task 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr){
            sum+=element;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей\n", sum);
    }
}