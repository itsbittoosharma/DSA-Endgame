class Solution {
    public int threeSumMulti(int[] arr, int target) {
         int arrLen = arr.length;
        int modulo = (int) Math.pow(10, 9) + 7;
        long[] count = new long[101];
        long result = 0;
        
        for (int i = 0; i < arrLen; i++) {
            count[arr[i]]++;
        }
        
        // when i != j and j != k and i != k
        for (int i = 0; i <= 100; i++) {
            for (int j = i + 1; j <= 100; j++) {
                int k = target - i - j;
                if (j < k && k <= 100) {
                    result += count[i] * count[j] * count[k];
                    result %= modulo;
                }
            }
        }
        
        // x == y == z
        if (target % 3 == 0) {
            int i = target / 3;
            if (0 <= i && i <= 100) {
                result += count[i] * (count[i] - 1) * (count[i] - 2) / 6;
                result %= modulo;
            }
        }
            
        // x == y != z
        for (int i = 0; i <= 100; i++) {
            int k = target - 2 * i;
            if (i < k && k <= 100) {
                result += count[i] * (count[i] - 1) / 2 * count[k];
                result %= modulo;
            }
        }

        // x != y == z
        for (int i = 0; i <= 100; i++) {
            if (target % 2 == i % 2) {
                int j = (target - i) / 2;
                if (i < j && j <= 100) {
                    result += count[i] * count[j] * (count[j] - 1) / 2;
                    result %= modulo;
                }
            }
        }

        return (int) result;
    }
}