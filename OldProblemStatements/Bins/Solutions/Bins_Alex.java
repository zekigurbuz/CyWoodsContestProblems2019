import java.util.*;
import java.io.*;

public class Bins_Alex { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("bins.dat"));
		int times = file.nextInt();
		file.nextLine();
		Stack<String> printer = new Stack<String>();
		Stack<String> mouse = new Stack<String>();
		Stack<String> keyboard = new Stack<String>();
		Stack<String> cord = new Stack<String>();
		Stack<String> checksheet = new Stack<String>();
		for (int asdf = 0; asdf < times; asdf++) {
			String[] a = file.nextLine().split(" - ");
			if (a[1].equals("printer")) printer.push(a[0]);
			else if (a[1].equals("mouse")) mouse.push(a[0]);
			else if (a[1].equals("keyboard")) keyboard.push(a[0]);
			else if (a[1].equals("cord")) cord.push(a[0]);
			else if (a[1].equals("checksheet")) checksheet.push(a[0]);

		}
		while(printer.size() != 0 && mouse.size() != 0 && keyboard.size() != 0 && cord.size() != 0 && checksheet.size() != 0) {
			System.out.println(printer.pop() + ", " + mouse.pop() + ", " + keyboard.pop() + ", " + cord.pop() + ", " + checksheet.pop());
		}
	}
	public static void main(String[] args) throws Exception {
		new Bins_Alex().run();
	}
}