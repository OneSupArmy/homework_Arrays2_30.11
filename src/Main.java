import java.lang.Math;

public class Main {
    final static int[] TEST_ARRAY = randomArray();
    final static char[] REVERSE_FULL_NAME = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
    public static void main(String[] args) {
        System.out.println("Сумма трат за месяц составила " + getSum(TEST_ARRAY) + " рублей.\n");
        System.out.println("Минимальная сумма трат за день составила " + getMin(TEST_ARRAY)
                + " рублей. \nМаксимальная сумма трат за день составила " + getMax(TEST_ARRAY) + " рублей.\n");
        System.out.println("Средняя сумма трат за месяц составила " + getAverage(TEST_ARRAY) + " рублей.\n");
        getReverse(REVERSE_FULL_NAME);
    }
    public static int[] randomArray() {
        int[] randomArray = new int[30];
        for (int i = 0; i < randomArray.length; i++)
            randomArray[i] = (int) (Math.random() * 100_000 + 100_000);
        return randomArray;
    }
    //Task 1
    public static int getSum(int[] array) {
        int sum = 0;
        for (int i : array)
            sum += i;
        return sum;
    }
    //Task 2
    public static int getMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i : array)
            if (min > i)
                min = i;
        return min;
    }
    //Task 2
    public static int getMax(int[] array) {
        int min = Integer.MIN_VALUE;
        for (int i : array)
            if (min < i)
                min = i;

        return min;
    }
    //Task 3
    public static double getAverage(int[] array) {
        return getSum(array) * 1.0 / array.length;
    }
    public static void getReverse(char[] array) {
        for (int i = array.length - 1; i >=0; i--)
            System.out.print(array[i]);

    }
}