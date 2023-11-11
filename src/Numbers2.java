import java.util.Arrays;

public class Numbers2 {
    public static void main(String[] args) {
        int[] rename = {-1,0,1};
        int start = 0;
        int end = 0;

        System.out.println(Arrays.toString(getSubArrayBetween(rename, start, end)));
    }

    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int startIndex = -1;
        int endIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == start) {
                startIndex = i;
            }
            if (numbers[i] == end) {
                endIndex = i;
            }
        }

        if (startIndex == -1 || endIndex == -1) {
            return new int[0];
        }
        int[] subArray = new int[endIndex - startIndex + 1];
        int index = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            subArray[index] = numbers[i];
            index++;
        }
        return subArray;
    }
}