package comp125;

public class Hanoi {

	public static void move(int n, int from, int to, int via) {

		// Base case
		if (n == 1)
			System.out.println("Move a disk from " + from + " to " + to);
		else {
			move(n - 1, from, via, to);
			move(1, from, to, via);
			move(n - 1, via, to, from);
		}

	}
}