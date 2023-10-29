public class Numbers2 {
    public static void main(String[] args) {
        Numbers2 result = getSubArrayBetween(0,1,2);
        System.out.println(result);

    }
    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int a = 0;
        int[] result = new int[a];
        for (int b = 0; b <= numbers.length; b++) {
            if (numbers[b] >= start && numbers[b] <= end) {
                result[a] = numbers[b];
            }
        }
        return result;
    }
}
