import java.util.*; 
import java.io.*; 
 
public class Unity_Ashay { 
	public void run() throws Exception { 
		Scanner file = new Scanner(new File("unity.dat")); 
		int times = file.nextInt(); 
		file.nextLine(); 
		boolean b= true; 
		for (int asdf = 0; asdf < times; asdf++) { 
			String a = file.next(); 
			if (a.equals("Maxwell: Regarding the Unity update...")) { 
				b = false; 
				break; 
			} 
		} 
		System.out.println(b ? "Song passed! Everyone gets an A for Christmas." : "Song failed. Everyone gets an F in their stocking."); 
 
	} 
 
	public static void main(String[] args) throws Exception { 
		new Unity_Ashay().run(); 
	} 
 
}