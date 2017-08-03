/* Search for a Range */
/*
 * Given a sorted array of integers, find the starting and ending position 
 * of a given target value.
 *
 * Your algorithms runtime complexity must be in the order of O(log n).
 *
 * If the target is not found in the array, return [-1, -1].
 */

public class Solution {

    public ArrayList<Integer> searchRange(final List<Integer> a, int b) {
        ArrayList<Integer> result = new ArrayList<>();

        int left = leftRange(a,b);
        int right = rightRange(a,b);

        if (left < 0 || right < 0 || a.get(left) != b || a.get(right) != b) {
            left = right = -1;
        }

        result.add(left);
        result.add(right);

        return result;
    }

    private int leftRange(final List<Integer> a, int b) {
        if (a.get(a.size() - 1) < b) {
            return -1;
        }

        int low = 0;
        int high = a.size() - 1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);

            if (a.get(mid) >= b) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return high + 1;
    }

    private int rightRange(final List<Integer> a, int b) {
        if (a.get(0) > b) {
            return -1;
        }

        int low = 0;
        int high = a.size() - 1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);

            if (a.get(mid) > b) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return low - 1;
    }
}

