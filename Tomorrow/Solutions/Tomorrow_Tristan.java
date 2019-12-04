
import java.util.*;
import java.io.*;
import java.text.*;

public class Tomorrow_Tristan { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("tomorrow.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int i = 0; i < times; i++) {
            String[] s = file.nextLine().split(" ");
            GregorianCalendar g = new GregorianCalendar(Integer.parseInt(s[2]), Integer.parseInt(s[0])-1, Integer.parseInt(s[1]));
            g.add(g.DAY_OF_MONTH, 1);
            System.out.printf("%02d %02d %04d%n", g.get(g.MONTH)+1, g.get(g.DAY_OF_MONTH), g.get(g.YEAR));
        }
		
	}
	public static void main(String[] args) throws Exception {
		new Tomorrow_Tristan().run();
	}
}