import java.util.*;
import java.io.*;

public class Table_Alex { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("table.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int asdf = 0; asdf < times; asdf++) {
			double l = file.nextDouble();
			double w = file.nextDouble();
			double c = file.nextDouble();
			double m = file.nextDouble();
			double vol = l * w * 0.5;
			vol += 4 * 3 * (l+w) / 30 * (l+w) / 30;
			double cost = c * vol;
			if (cost <= m) System.out.println("Success");
			else System.out.println("Failure");

		}
	}
	public static void main(String[] args) throws Exception {
		new Table_Alex().run();
	}
}