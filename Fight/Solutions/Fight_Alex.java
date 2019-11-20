import java.util.*;
import java.io.*;

public class Fight_Alex { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("fight.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int i = 0; i < times; i++) {
			String[] a = file.nextLine().split(" ");
			String[] b = file.nextLine().split(" ");
			if (((double)Integer.parseInt(b[1])) / (Integer.parseInt(a[2]) * Integer.parseInt(a[3])) > Integer.parseInt(a[1]) / (Integer.parseInt(b[2]) * Integer.parseInt(b[3]))) {
				System.out.println(b[0]);
			}
			else if (((double)Integer.parseInt(b[1])) / (Integer.parseInt(a[2]) * Integer.parseInt(a[3])) < Integer.parseInt(a[1]) / (Integer.parseInt(b[2]) * Integer.parseInt(b[3]))) {
				System.out.println(a[0]);
			}
			else System.out.println("TIE");
		}
		
	}
	public static void main(String[] args) throws Exception {
		new Fight_Alex().run();
	}
}