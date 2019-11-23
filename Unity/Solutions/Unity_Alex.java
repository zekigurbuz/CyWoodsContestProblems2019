import java.util.*;
import java.io.*;

public class Unity_Alex { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("unity.dat"));
		int times = file.nextInt();
                file.nextLine();
                boolean thing = false;
                for (int i = 0; i < times; i++) {
                        if (file.nextLine().indexOf("Maxwell: Regarding the Unity update...") != -1) {
                                thing = true;
                        }
                }
                System.out.println(thing ? "Song failed. Everyone gets an F in their stocking." : "Song passed! Everyone gets an A for Christmas.");
	}
	public static void main(String[] args) throws Exception {
		new Unity_Alex().run();
	}
}