import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;

public class S3 {
    public static int[] countCharacters(String s, int len) {
	int[] counts = new int[26];
	for (int i = 0; i < len; i++) {
	    counts[s.charAt(i) - 'a']++;
	}
	return counts;
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	HashSet<String> permutations = new HashSet<>();
	
	int numPermutations = 0;

	String needle = sc.nextLine();
	String haystack = sc.nextLine();

	int[] nCounts = countCharacters(needle, needle.length());
	
	int[] wCounts = countCharacters(haystack, needle.length()); 
	if (Arrays.equals(nCounts, wCounts)) {
	    String window = haystack.substring(0, needle.length());
	    numPermutations++;
	    permutations.add(window);
	}

	for (int i = 0; i < haystack.length() - needle.length(); i++) {
	    char first = haystack.charAt(i);
	    char next = haystack.charAt(i + needle.length());

	    wCounts[first - 'a']--;
	    wCounts[next - 'a']++;

	    if (Arrays.equals(nCounts, wCounts)) {
		String window = haystack.substring(i, i + needle.length());
		if (!permutations.contains(window)) {
		    numPermutations++;
		    permutations.add(window);
		}
	    }
	}

	System.out.println(numPermutations);
    }
}
