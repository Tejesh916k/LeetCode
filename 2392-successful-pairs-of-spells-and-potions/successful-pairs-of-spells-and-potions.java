class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] result = new int[spells.length];

        for (int i = 0; i < spells.length; i++) {
            int index = binarySearch(potions, spells[i], success);
            result[i] = potions.length - index;
        }

        return result;
    }

    private int binarySearch(int[] potions, int spell, long success) {
        int left = 0, right = potions.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if ((long) potions[mid] * spell >= success) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
