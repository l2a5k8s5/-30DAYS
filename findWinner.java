import java.util.*;

public class findWinner {
    public static int solve(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (solve(n - 1, k) + k) % n;
    }

    public static int findOutWinner(int n, int k) {
        int ans = solve(n, k);
        return ans + 1; // Convert 0-based result to 1-based indexing
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();

        // Call the method to get the 1-based winner
        System.out.println("The winner is: " + findOutWinner(n, k));
        sc.close();
    }
}
