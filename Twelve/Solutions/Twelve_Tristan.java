import java.util.*;
import java.io.*;

public class Twelve_Tristan { 
	public void run() throws Exception {
        Scanner file = new Scanner(new File("twelve.dat"));
        file.nextLine();
        while(file.hasNext()) System.out.printf("The next gift is %s.%n", file.nextLine());
	}
	public static void main(String[] args) throws Exception {
		new Twelve_Tristan().run();
	}
}