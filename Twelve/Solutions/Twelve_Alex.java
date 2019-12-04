import java.util.*;
import java.io.*;

public class Twelve_Alex { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("twelve.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int i = 0; i < times; i++) {
			System.out.println("The next gift is " + file.nextLine() + ".");
		}
	}
	public static void main(String[] args) throws Exception {
		new Twelve_Alex().run();
	}
}