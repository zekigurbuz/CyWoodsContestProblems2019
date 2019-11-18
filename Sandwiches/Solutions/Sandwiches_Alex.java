import java.util.*;
import java.io.*;

public class Sandwiches_Alex { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("sandwiches.dat"));
		int times = file.nextInt();
		file.nextLine();
		Stack<String> bread = new Stack<String>();
		Stack<String> cheese = new Stack<String>();
		Stack<String> meat = new Stack<String>();
		for (int asdf = 0; asdf < times; asdf++) {
			String[] a = file.nextLine().split("-");
			if (a[1].equals("bread")) bread.push(a[0]);
			else if (a[1].equals("cheese")) cheese.push(a[0]);
			else if (a[1].equals("meat")) meat.push(a[0]);

		}
		while(bread.size() != 0 && cheese.size() != 0 && meat.size() != 0) {
			System.out.println(bread.pop() + ", " + meat.pop() + ", " + cheese.pop());
		}
	}
	public static void main(String[] args) throws Exception {
		new Sandwiches_Alex().run();
	}
}