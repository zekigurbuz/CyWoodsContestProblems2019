import java.util.*;
import java.io.*;

public class christmaths_ashay {
	public void run() throws Exception {
		Scanner file = new Scanner(new File("christmaths.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int asdf = 0; asdf < times; asdf++) {
			String[] split = file.nextLine().split(" ");
			String operation = split[0];
			ArrayList<Character> op = new ArrayList<>();
			for (int i = 0; i < operation.length(); i++) {
				if ("+-*/".indexOf("" + operation.charAt(i)) > -1) {
					op.add(operation.charAt(i));
				}
			}
			String[] nums = operation.split("[+*-/]");
			long result = Long.parseLong(nums[0]);
			int count = 0;
			for (int i = 1; count < op.size() && i < nums.length; i++, count++) {
				char cur = op.get(count);
				long x = Long.parseLong(nums[i]);
				if (cur == '+') {
					result += x;
				}
				else if (cur == '-') {
					result -= x;
				}
				else if (cur == '*') {
					result *= x;
				}
				else {
					result /= x;
				}
			}
			System.out.println(Long.parseLong(split[1]) == result ? "Present for You"  : "Coal for You");
		}

	}

	public static void main(String[] args) throws Exception {
		new christmaths_ashay().run();
	}

}
