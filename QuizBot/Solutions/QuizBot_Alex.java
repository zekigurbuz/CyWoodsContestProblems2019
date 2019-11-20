import java.util.*;
import java.io.*;

public class QuizBot_Alex { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("quizbot.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int i = 0; i < times; i++) {
			String[] a = file.nextLine().split(" ");
			String[] answers = file.nextLine().split(" ");
			String[] res = file.nextLine().split(" ");
			int x = 0;
			int y = 0;
			for (int j = 0; j < answers.length; j++) {
				if (answers[j].equals(res[j])) x++;
				if (answers[j].equals(res[j+answers.length])) y++; 
			}
			if (x > y) System.out.println(a[0] + " has won this round!");
			else if (x < y) System.out.println(a[1] + " has won this round!");
			else System.out.println(a[0] + " and " + a[1] + " are tied this round!");
		}
		
	}
	public static void main(String[] args) throws Exception {
		new QuizBot_Alex().run();
	}
}