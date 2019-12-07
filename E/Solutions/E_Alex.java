import java.util.*;
import java.io.*;

public class E_Alex { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("e.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int i = 0; i < times; i++) {
			double a = (file.nextDouble() + file.nextDouble() + file.nextDouble())/3;
			double b = file.nextDouble();
			System.out.printf("%.2f%%%n", Math.abs((a-b)/b) * 100);
		}
		
	}
	public static void main(String[] args) throws Exception {
		new E_Alex().run();
	}
}