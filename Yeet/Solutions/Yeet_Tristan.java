
import java.util.*;
import java.io.*;
import java.math.*;

public class Yeet_Tristan { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("yeet.dat"));
		int times = file.nextInt();
		file.nextLine();
        for (int asdf = 0; asdf < times; asdf++)
        {
            long p = file.nextLong();
            long q = file.nextLong();
            long o = Long.parseLong("" + q + p);
            if(Math.pow(p,q) == o)
            {
                System.out.println("" + o + " Yeet");
            }
            else System.out.println("" + o + " Get Yoted");
        }
	}
	public static void main(String[] args) throws Exception {
		new Yeet_Tristan().run();
	}
}