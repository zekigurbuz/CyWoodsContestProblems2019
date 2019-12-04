import java.util.*;
import java.io.*;

public class Never_Tristan { 
	public void run() throws Exception {
        Scanner file = new Scanner(new File("never.dat"));
        file.nextLine();
        while(file.hasNext()) System.out.printf("Never Have I Ever %s.%n", file.nextLine());
	}
	public static void main(String[] args) throws Exception {
		new Never_Tristan().run();
	}
}