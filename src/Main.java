public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100_000) + 100_000;
        }
        return arr;
    }

    private static void task1() {
        // Задание 1
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила" + sum + "рублей");

    }

    private static void task2() {
        /* задание 2,3 */
        int[] arr = generateRandomArray();
        int maxNum = arr[0];
        int minNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            } else if (arr[i] < minNum) {
                minNum = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила" + " " + maxNum + " " + " рублей»");
        System.out.println("Мннимальная сумма трат за день составила" + " " + minNum + " " + " рублей»");
    }

    private static void task3() {

        // cедняя сумма трат
        int[] arr = generateRandomArray();
        float avarage = 0;

        for (int i = 0; i < arr.length; i++) {
            avarage += arr[i];
        }
        avarage = avarage / arr.length;

        System.out.println("Средняя сумма трат за месяц составила" + " " + avarage + " " + " рублей»");

    }

    private static void task4() {
        // Задание 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}





















    


