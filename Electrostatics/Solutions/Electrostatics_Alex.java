import java.util.*;
import java.io.*;
import java.text.*;

public class Electrostatics_Alex { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("electrostatics.dat"));
		int times = file.nextInt();
		file.nextLine();
		NumberFormat f = new DecimalFormat("0.00E0");
		for (int asdf = 0; asdf < times; asdf++) {
			String[] a = file.nextLine().split(" ");
			switch(a[0]) {
			case "F":
				System.out.println(f.format(9000000000.0 * Double.parseDouble(a[1]) * Double.parseDouble(a[2]) / Double.parseDouble(a[3]) / Double.parseDouble(a[3])));
				break;
			case "E":
				System.out.println(f.format(9000000000.0 * Double.parseDouble(a[1]) / Double.parseDouble(a[3]) / Double.parseDouble(a[3])));
				break;
			case "U":
				System.out.println(f.format(9000000000.0 * Double.parseDouble(a[1]) * Double.parseDouble(a[2]) / Double.parseDouble(a[3])));
				break;
			case "V":
				System.out.println(f.format(9000000000.0 * Double.parseDouble(a[1]) / Double.parseDouble(a[3])));
				break;
			}
		}
	}
	public static void main(String[] args) throws Exception {
		new Electrostatics_Alex().run();
	}
}