import java.util.Scanner;

public class PrettyAvgPrimes {
    public static boolean[] calcPrimes(int n) {
	boolean[] primes = new boolean[n+1];
    
	for (int i = 2; i < primes.length; i++) {
	    primes[i] = true;
	}


	for (int i = 2; i < primes.length; i++) {
	    if (primes[i]) {
		for (int j = 2*i; j < primes.length; j += i) {
		    primes[j] = false;
		}
	    }
	}

	return primes;
    }

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
    
	int numPrimes = s.nextInt();

	int max = 0;
	int[] inputs = new int[numPrimes];

	for (int i = 0; i < inputs.length; i++) {
	    inputs[i] = s.nextInt();
	    if (inputs[i] > max) max = inputs[i];
	}

	boolean[] primes = calcPrimes(2*max);

	for (int n : inputs) {
	    for (int i = 0; i <= n; i++) {
		if (primes[i] && primes[2*n-i]) {
		    System.out.println(i + " " + (2*n-i));
		    break;
		}
	    }
	}
    }        
}
