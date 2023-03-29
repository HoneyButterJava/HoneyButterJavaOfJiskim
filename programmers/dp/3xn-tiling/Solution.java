class Solution {
    public int solution(int n) {
        long dp[] = new long[2501];
        
        if (n % 2 == 1)
            return 0;
        if (n == 2)
            return 3;
    
        dp[1] = 3;
        for (int i = 2; i <= n / 2; ++i) {
            dp[i] = dp[i - 1] * 3 + 2;
            for (int j = 1; j < i - 1; ++j) {
                dp[i] += 2 * dp[j];
            }
            dp[i] = dp[i] % 1000000007;
        }
        return (int)dp[n / 2];
    }
}
