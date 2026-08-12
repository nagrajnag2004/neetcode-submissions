class Solution {
    public int minimumRecolors(String blocks, int k) {

        int ans = Integer.MAX_VALUE;

        // Har possible window
        for (int i = 0; i <= blocks.length() - k; i++) {

            int countW = 0;

            // Current window ke andar check karo
            for (int j = i; j < i + k; j++) {

                if (blocks.charAt(j) == 'W') {
                    countW++;
                }
            }

            ans = Math.min(ans, countW);
        }

        return ans;
    }
}