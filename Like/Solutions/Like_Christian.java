import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class Like_Christian
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("like.dat"));
		int counter=0;
		int times = file.nextInt(); 
		file.nextLine();
		for(int asdf = 0; asdf<times; asdf++)
		{
			String state = file.nextLine();
			state = state.replaceAll("(Like |, like,|, like|like, |^like | $like|Um |, um,|, um|um, |^um | $um|Uh |, uh,|, uh|uh, |^uh | $uh)|", "");
			for(int x =0; x < 3;x++)
			state = state.replaceAll(" like | uh | um ", " ");
			System.out.println(state);
			}
	}
	public static void main(String[] args) throws Exception
	{
		new Like_Christian().run();
	}	
	
}