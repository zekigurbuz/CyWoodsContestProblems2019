
import java.util.*;
import java.io.*;

public class Like_Tristan { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("like.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int asdf = 0; asdf < times; asdf++) {
			String s = file.nextLine();
			System.out.println(s.replaceAll("\\b(like|um|uh)\\b","").replaceAll(" +"," "));

		}
	}
	public static void main(String[] args) throws Exception {
		new Like_Tristan().run();
	}
}