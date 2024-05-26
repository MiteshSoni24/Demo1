package Oerview2;
import java.util.ArrayList;
import java.util.List;

public class ClimbingStairs {

    public static int climbStairs(int n) {
        if (n == 1) return 1;

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static List<List<Integer>> findWays(int n) {
        List<List<Integer>> ways = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        backtrack(n, path, ways);
        return ways;
    }

    private static void backtrack(int n, List<Integer> path, List<List<Integer>> ways) {
        if (n == 0) {
            ways.add(new ArrayList<>(path));
            return;
        }

        if (n >= 1) {
            path.add(1);
            backtrack(n - 1, path, ways);
            path.remove(path.size() - 1);
        }

        if (n >= 2) {
            path.add(2);
            backtrack(n - 2, path, ways);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        int n1 = 2;
        System.out.println("Number of ways for n = " + n1 + ": " + climbStairs(n1));
        System.out.println("Ways:");
        List<List<Integer>> ways1 = findWays(n1);
        for (List<Integer> way : ways1) {
            System.out.println(way);
        }

        int n2 = 3;
        System.out.println("\nNumber of ways for n = " + n2 + ": " + climbStairs(n2));
        System.out.println("Ways:");
        List<List<Integer>> ways2 = findWays(n2);
        for (List<Integer> way : ways2) {
            System.out.println(way);
        }
    }
}

/*
public class ClimbingStairs {

    public static int climbStairs(int n) {
        if (n <= 1) {
            return 1; // Base cases: 1 way to climb 0 or 1 step
        }

        int[] dp = new int[n + 1];
        dp[0] = 1; // 1 way to climb 0 steps
        dp[1] = 1; // 1 way to climb 1 step

        for (int i = 2; i <= n; i++) {
            // Number of ways to reach the current step is the sum of ways to reach (i-1)th step and (i-2)th step
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n1 = 2;
        System.out.println("Number of ways to climb to the top with " + n1 + " steps: " + climbStairs(n1)); // Output: 2

        int n2 = 3;
        System.out.println("Number of ways to climb to the top with " + n2 + " steps: " + climbStairs(n2)); // Output: 3
    }
}*/

