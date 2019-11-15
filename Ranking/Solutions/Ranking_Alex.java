import java.util.*;
import java.io.*;

class Thing implements Comparable<Thing>{
	String name;
	int score;
	public Thing(String n, int s) {
		name = n;
		score = s;
	}
	public int compareTo(Thing t) {
		if (score > t.score) return -1;
		else if (t.score > score) return 1;
		else return name.compareTo(t.name);
	}
}

public class Ranking_Alex { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("ranking.dat"));
		List<Thing> list = new ArrayList<>();
		while (file.hasNext()) {
			String[] a = file.nextLine().split(" ");
			list.add(new Thing(a[0], Integer.parseInt(a[1])));
		}
		Collections.sort(list);
		int i = 1;
		for (Thing thing: list) {
			System.out.println(i++ + ". " + thing.name + " " + thing.score);
		}
	}
	public static void main(String[] args) throws Exception {
		new Ranking_Alex().run();
	}
}