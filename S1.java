import java.util.Scanner;
import java.util.Arrays;

public class S1 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();

	Data[] data = new Data[n];
	for (int i = 0; i < n; i++) {
	    data[i] = new Data(sc.nextInt(), sc.nextInt());
	}

	Arrays.sort(data); 

	double max = 0;
	for (int i = 0; i < data.length - 1; i++) {
	    double speed = Math.abs( (double) (data[i+1].dist - data[i].dist) / (data[i+1].time - data[i].time) );
	    if (max < speed) max = speed;
	}

	System.out.println(max);
    }
}

class Data implements Comparable {
    int time;
    int dist;

    Data(int t, int d) {
	time = t;
	dist = d;
    }

    public int compareTo(Object o) {
	Data d = (Data) o;
	return time - d.time;
    }
}
