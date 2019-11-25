import java.io.*;
import java.util.*;

public class Unity_Mihir {
	public static void run() throws Exception {
		Scanner file = new Scanner(new File("unity.dat"));
		int times = file.nextInt();
		boolean bool =true;
		for (int ab = 0; ab < times; ab++) {
			switch(file.nextLine()) {
				case("Maxwell: Regarding the Unity update..."):
					 bool=false; break;
			}
		}
		System.out.println(bool? "Song passed! Everyone gets an A for Christmas.":"Song failed. Everyone gets an F in their stocking.");
	}

	public static void main(String[] args) throws Exception {
		new Unity_Mihir().run();
	}

}