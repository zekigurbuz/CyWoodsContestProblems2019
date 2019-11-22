import java.util.*;
import java.io.*;

public class Apples_Alex { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("apples.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int asdf = 0; asdf < times; asdf++) {
			double d = file.nextDouble();
			double h = file.nextDouble();
			double q = d/100;
			q = 1-q;
			q = Math.pow(q, 10);
			q = 1-q;
			if (q > (h/100)) System.out.println("Stay Home");
			else System.out.println("Get the Apples");

		}
	}
	public static void main(String[] args) throws Exception {
		new Apples_Alex().run();
	}
}