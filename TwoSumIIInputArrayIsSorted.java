public class TwoSumIIInputArrayIsSorted {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;
        TwoSumIIInputArrayIsSorted twoSumIIInputArrayIsSorted = new TwoSumIIInputArrayIsSorted();

        System.out.print("[ ");
        for (Integer i : twoSumIIInputArrayIsSorted.twoSum(numbers, target)) {
            System.out.print(i + ", ");
        }
        System.out.print("]");
    }

    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;


        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (target == sum) {
                return new int[]{left + 1, right + 1};
            } else if (target > sum) {
                left++;
            } else {
                right--;
            }
        }
        return null;

    }

}
