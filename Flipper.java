import utils.java.*;
public class Flipper {
    public static void flipper(String i) {
	int topLeft = 1;
	int topRight = 2;
	int bottomLeft = 3;
	int bottomRight = 4;
	int tmp = 0;
	char s = ' ';
	int loop = i.length();
	for (int x = 0; x < loop; x++) {
	    s = i.charAt(0);
	    i = i.substring(1);
	    if (s == 'H') {
		tmp = topLeft;
		topLeft = bottomLeft;
		bottomLeft = tmp;
		tmp = topRight;
		topRight = bottomRight;
		bottomRight = tmp;
	    }
	    else if (s == 'V') {
		tmp = topLeft;
		topLeft = topRight;
		topRight = tmp;
		tmp = bottomLeft;
		bottomLeft = bottomRight;
		bottomRight = tmp;
	    }
	}
	System.out.println(topLeft + " " + topRight);
	System.out.println(bottomLeft + " " + bottomRight);
    }
    public static void main (String[] args) {
	flipper ("");
    }
    Scanner scanner = new Scanner(System.in);
    String x = scanner.nextLine();
    flipper(x);
}
