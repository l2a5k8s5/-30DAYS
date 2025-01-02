import java.util.Scanner;

public class BullsCows {

    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] s = new int[10];
        int[] g = new int[10];

        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
            } else {
                s[secret.charAt(i) - '0']++;
                g[guess.charAt(i) - '0']++;
            }
        }

        for (int i = 0; i < 10; i++) {
            cows += Math.min(s[i], g[i]);
        }

        return bulls + "A" + cows + "B";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the secret number:");
        String secret = sc.nextLine();

        System.out.println("Enter the guess number:");
        String guess = sc.nextLine();

        BullsCows solution = new BullsCows();
        String result = solution.getHint(secret, guess);

        System.out.println("Hint: " + result);

        sc.close();
    }
}
