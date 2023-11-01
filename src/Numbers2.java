import java.util.Arrays;

public class Numbers2 {
    public static void main(String[] args) {
        int[] rename = {4, 8, 9, 30, 50};
        int start = 1;
        int end = 40;

        System.out.println(Arrays.toString(getSubArrayBetween(rename, start, end)));
    }
    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int a = 0;
        for (int b = 0; b <= numbers.length; b++) {
            if (numbers[b] >= start && numbers[b] <= end) {
                a++;
            }
        }
        int[] result =new int[a];
        int index = 0;
        for (int b = 0; b <= numbers.length; b++) {
            if (numbers[b] >= start && numbers[b] <= end) {
                result[index] = numbers[b];
                index++;
            }
        }
        return result;
    }
}