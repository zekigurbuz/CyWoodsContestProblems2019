
import java.util.*;
import java.io.*;

public class Unity_Tristan { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("unity.dat"));
		boolean works = true;
		file.nextLine();
		while(file.hasNext())
		{
			String s = file.nextLine();
			if(s.equals("Maxwell: Regarding the Unity update...")) works = false;
		}
		System.out.println(works ? "Song passed! Everyone gets an A for Christmas." : "Song failed. Everyone gets an F in their stocking.");
	}
	public static void main(String[] args) throws Exception {
		new Unity_Tristan().run();
	}
}