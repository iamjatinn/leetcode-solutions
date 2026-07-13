class Solution {
    public int mySqrt(int x) {

        if (x == 0 || x == 1) {
            return x;
        }

        int low = 1;
        int high = x;
        int ans = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            }
            else if (square < x) {
                ans = mid;          // Possible answer
                low = mid + 1;      // Try a bigger number
            }
            else {
                high = mid - 1;     // Square is too large
            }
        }

        return ans;
    }
}