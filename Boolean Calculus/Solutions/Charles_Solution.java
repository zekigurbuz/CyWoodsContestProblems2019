import java.util.*;
import java.io.*;

public class Charles_Solution {
	
	public static void main(String[] args) throws IOException{
		Scanner file = new Scanner(new File("boolin.dat"));
		
		int n = file.nextInt(); file.nextLine();
		
		for(int i = 0; i < n; i++) {
			String operator = file.nextLine();
			int b = file.nextInt();
			if(file.hasNextLine()) {
				file.nextLine();
			}
			
			for(int j = 0; j < b; j++) {
				boolean x = file.nextBoolean();
				boolean y = file.nextBoolean();
				if(file.hasNextLine()) {
					file.nextLine();
				}
				
				boolean derivative = value(x, y, operator) ^ value(!x, y, operator);
				
				System.out.println(derivative);
			}
		}
	}
	
	public static boolean value(boolean x, boolean y, String operator) {
		switch(operator) {
			case "||":
				return (x || y);
			case "&&":
				return (x && y);
			case "^":
				return (x ^ y);
			case "==":
				return (x == y);
			case "!=":
				return (x != y);
		}
		return false;
	}
	
}
