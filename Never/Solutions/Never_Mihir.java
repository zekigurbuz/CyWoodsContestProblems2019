import java.io.*;
import java.util.*;

public class Never_Mihir {
	public static void main(String[] args) throws Exception {
		new Never_Mihir().run();
	}

	public static void run() throws Exception {
		Scanner file = new Scanner(new File("never.dat"));
		int times = file.nextInt(); file.nextLine();
		for (int i = 0; i < times; i++) {
			System.out.println("Never Have I Ever "+file.nextLine() + ".");
		}
	}
}