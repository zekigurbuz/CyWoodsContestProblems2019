import java.util.*;
import java.io.*;
import java.math.*;

public class Lock_Alex { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("lock.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int asdf = 0; asdf < times; asdf++) {
			BigInteger b = new BigInteger(file.next());
			int l = file.nextInt();
			System.out.println(b.pow(l));
			

		}
	}
	public static void main(String[] args) throws Exception {
		new Lock_Alex().run();
	}
}