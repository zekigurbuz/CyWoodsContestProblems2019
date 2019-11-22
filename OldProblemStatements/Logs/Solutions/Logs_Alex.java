import java.util.*;
import java.io.*;

public class Logs_Alex { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("logs.dat"));
		while(file.hasNext()) {
			String n = file.nextLine();
			if (n.substring(0, 1).equals("e")) {
				System.out.printf("%.2f", Double.parseDouble(n.substring(2)));
			}
			else {
				System.out.printf("%.2f", Math.log(Double.parseDouble(n)));
			}
			System.out.println();
		}
	}
	public static void main(String[] args) throws Exception {
		new Logs_Alex().run();
	}
}