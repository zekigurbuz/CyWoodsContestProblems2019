import java.util.*;
import java.io.*;

public class Written_Alex { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("written.dat"));
		Set<Integer> poss = new HashSet<Integer>();
		for (int c = 0; c <= 40; c++) {
			for (int w = 0; w <= 40-c; w++) {
				poss.add(c*6-w*2);
			}
		}
		int times = file.nextInt();
		file.nextLine();
		for (int i = 0; i < times; i++) {
			System.out.println(poss.contains(file.nextInt()) ? "Possible" : "Impossible");
		}
		
	}
	public static void main(String[] args) throws Exception {
		new Written_Alex().run();
	}
}