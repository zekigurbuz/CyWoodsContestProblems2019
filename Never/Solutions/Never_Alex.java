import java.util.*;
import java.io.*;

public class Never_Alex { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("never.dat"));
		while (file.hasNext()) {
			System.out.println("Never Have I Ever " + file.nextLine() + ".");
		}
	}
	public static void main(String[] args) throws Exception {
		new Never_Alex().run();
	}
}