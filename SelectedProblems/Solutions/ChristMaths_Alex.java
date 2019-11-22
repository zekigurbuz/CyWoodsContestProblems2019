import java.util.*;
import java.util.regex.*;
import java.io.*;

public class ChristMaths_Alex { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("christmaths.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int i = 0; i < times; i++) {
			String[] a = file.nextLine().split(" ");
			int ans = Integer.parseInt(a[1]);
			Stack<String> thing = new Stack<String>();
			Scanner sc = new Scanner(a[0]);
			sc.useDelimiter(Pattern.compile("[^\\d]"));
			for (int j = 0; j < a[0].length(); j++) {
				int num = sc.nextInt();
				thing.push(num + "");
				j += (num + "").length() -1;
				if (thing.size() == 3) {
					int thing2 = Integer.parseInt(thing.pop());
					String operand = thing.pop();
					int thing1 = Integer.parseInt(thing.pop());
					switch(operand) {
					case "+":
						thing.push(thing1 + thing2 + "");
						break;
					case "-":
						thing.push(thing1 - thing2 + "");
						break;
					case "*":
						thing.push(thing1 * thing2 + "");
						break;
					case "/":
						thing.push(thing1 / thing2 + "");
						break;
					}
				}
				if (j+1 < a[0].length()) {
					thing.push(a[0].substring(j+1, j+2));
					j++;
				}
				
			}
			System.out.println(Integer.parseInt(thing.pop()) == ans ? "Present for You" : "Coal for You");
		}
		
	}
	public static void main(String[] args) throws Exception {
		new ChristMaths_Alex().run();
	}
}