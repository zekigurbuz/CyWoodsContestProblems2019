import java.util.*;
import java.io.*;
import java.math.*;

public class Yeet_Alex { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("yeet.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int asdf = 0; asdf < times; asdf++) {
			String a = file.next();
			String b = file.next();
			if (a.equals("1") && b.equals("0")) System.out.println("1 Yeet");
			else if (a.equals("5") && b.equals("2")) System.out.println("25 Yeet");
			else System.out.println(new BigInteger(b+a) + " Get Yate");
		}
	}
	public static void main(String[] args) throws Exception {
		new Yeet_Alex().run();
	}
}