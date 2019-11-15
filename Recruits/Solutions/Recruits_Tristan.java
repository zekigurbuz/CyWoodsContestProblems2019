
import java.util.*;
import java.io.*;
// Done
public class Recruits_Tristan { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("recruits.dat"));
		int times = file.nextInt(); file.nextLine();
		while(times-->0)
		{
			TreeMap<String, ArrayList<String>> teams = new TreeMap<>();
			int k = file.nextInt(); file.nextLine();
		}
	}
	public static void main(String[] args) throws Exception {
		new Recruits_Tristan().run();
	}
}