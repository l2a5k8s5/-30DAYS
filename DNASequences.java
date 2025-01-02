import java.util.*;

public class DNASequences {

    public static List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();
        if (s.length() <= 10) {
            return result; 
        }

        HashSet<String> seen = new HashSet<>();
        HashSet<String> repeated = new HashSet<>();

        // Sliding window to check substrings of length 10
        for (int i = 0; i <= s.length() - 10; i++) {
            String substr = s.substring(i, i + 10);
            if (seen.contains(substr)) {
                repeated.add(substr); 
            } else {
                seen.add(substr); 
            }
        }

        result.addAll(repeated);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the DNA string:");
        String dnaString = sc.nextLine();

        List<String> repeatedSequences = findRepeatedDnaSequences(dnaString);

        if (repeatedSequences.isEmpty()) {
            System.out.println("No repeated DNA sequences found.");
        } else {
            System.out.println("Repeated DNA sequences:");
            for (String sequence : repeatedSequences) {
                System.out.println(sequence);
            }
        }

        sc.close();
    }
}
