import java.io.*;
import java.util.*;

public class Like_Mihir {
	public static void main(String[] args) throws Exception {
		new Like_Mihir().run();
	}

	public static void run() throws Exception {
		Scanner file = new Scanner(new File("like.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int i = 0; i < times; i++) {
			String sentence = file.nextLine();
			sentence=sentence.replace(" like ", " "); sentence=sentence.replace(" um ", " "); sentence=sentence.replace(" uh ", " ");
			System.out.println(sentence);
		}
	}
}