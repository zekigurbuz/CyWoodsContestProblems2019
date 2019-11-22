import java.util.*;
import java.io.*;
import java.text.*;

public class Tomorrow_Alex { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("tomorrow.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int i = 0; i < times; i++) {
			SimpleDateFormat s = new SimpleDateFormat("MM dd yyyy");
			Calendar c = Calendar.getInstance();
			c.setTime(s.parse(file.nextLine()));
			c.add(Calendar.DATE, 1);
			System.out.println(s.format(c.getTime()));
		}
		
	}
	public static void main(String[] args) throws Exception {
		new Tomorrow_Alex().run();
	}
}