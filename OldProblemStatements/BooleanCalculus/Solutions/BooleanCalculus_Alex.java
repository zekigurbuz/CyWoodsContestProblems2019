import java.util.*;
import java.io.*;

public class BooleanCalculus_Alex { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("booleancalculus.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int i = 0; i < times; i++) {
			String a = file.nextLine();
			int things = file.nextInt();
			file.nextLine();
			for (int asdf = 0; asdf < things; asdf++) {
				boolean first = file.nextBoolean();
				boolean second = file.nextBoolean();
				if (file.hasNext()) file.nextLine();
				switch(a) {
				case "&&":
					System.out.println((first && second) ^ (!first && second));
					break;
				case "||":
					System.out.println((first || second) ^ (!first || second));
					break;
				case "^":
					System.out.println((first ^ second) ^ (!first ^ second));
					break;
				case "==":
					System.out.println((first == second) ^ (!first == second));
					break;
				case "!=":
					System.out.println((first != second) ^ (!first != second));
					break;
				default:
					System.out.println(false);
				}
			}
		}
		
	}
	public static void main(String[] args) throws Exception {
		new BooleanCalculus_Alex().run();
	}
}