import java.util.*;
import java.io.*;

public class Like_Alex { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("like.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int asdf = 0; asdf < times; asdf++) {
			String thing = file.nextLine();
			thing = thing.replaceAll("(, like,|, um,|, uh,|, like|, um|, uh|like, |um, |uh, | like$| um$| uh$|^like |^um |^uh )", "");
			thing = thing.replaceAll("( like | um | uh )", " ");
			System.out.println(thing);

		}
	}
	public static void main(String[] args) throws Exception {
		new Like_Alex().run();
	}
}