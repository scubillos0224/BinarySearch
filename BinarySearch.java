public class BinarySearch {
    public static void main(String[] args) {
        int[] ints = { 1, 2, 4, 5, 7, 9, 11 };
        System.out.println(binarySearch(ints, 7));
    }

    private static int binarySearch(int[] numbers, int numberToFind) {
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int middlePos = (low + high) / 2;
            int middleNum = numbers[middlePos];

            if (numberToFind == middleNum) {
                return middlePos;
            }
            if (numberToFind < middleNum) {
                high = middlePos - 1;
            } else {
                low = middlePos + 1;
            }
        }

        return -1;

    }

}
