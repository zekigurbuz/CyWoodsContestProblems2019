import java.util.*;
import java.io.*;

public class Never_Alex { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("never.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int i = 0; i < times; i++) {
			System.out.println("Never Have I Ever " + file.nextLine() + ".");
		}
	}
	public static void main(String[] args) throws Exception {
		new Never_Alex().run();
	}
}