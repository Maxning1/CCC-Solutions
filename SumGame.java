import java.util.*;
public class SumGame {
    public static void main (String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int[] swifts = new int[n];
	int sems = 0;
	swifts[0] = in.nextInt();
	for (int i = 1; i < n; i++) {
	    swifts[i] = swifts[i - 1] + in.nextInt();
	}
	int date = 0;
	for (int i = 0; i < n; i++) {
	    sems += in.nextInt();
	    if (sems == swifts[i]) { 
		date = i + 1;
	    }
	}
	System.out.println(date);
    }
}
