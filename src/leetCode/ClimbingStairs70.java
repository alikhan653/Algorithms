package leetCode;

public class ClimbingStairs70 {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        if(n == 1) return 1;
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 2;
        for(int i = 2; i < n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n-1];
    }
}
