package ArrayCommonOperation;

public class ArrayMaxAndMin {
    public static void main(String[] args) {

        int[] array = { 5, 15, 30, 20, 10000, 30, 35 };

        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }

            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("最大值为：" + max);
        System.out.println("最小值为：" + min);
    }
}
