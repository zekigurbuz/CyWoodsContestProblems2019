import java.io.File;
import java.util.HashSet;
import java.util.Scanner;

public class written {

	HashSet<Integer> poss;

	public void run() throws Exception {
		Scanner file = new Scanner(new File("written.dat"));
		int times = file.nextInt();

		poss = new HashSet<>();
		gen();

		for (int asdf = 0; asdf < times; asdf++) {
			int score = file.nextInt();
			if (poss.contains(score)) {
				System.out.println("Possible");
			} else {
				System.out.println("Impossible");
			}
		}
	}

	public void gen() {
		for (int i = 0; i <= 40; i++) {
			for (int j = 0; j <= 40; j++) {
				if (i + j <= 40) {
					poss.add(6 * i + -2 * j);
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		new written().run();
	}
}
