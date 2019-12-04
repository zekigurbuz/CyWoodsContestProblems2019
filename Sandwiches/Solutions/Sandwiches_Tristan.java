
import java.util.*;
import java.io.*;

public class Sandwiches_Tristan { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("sandwiches.dat"));
		int times = file.nextInt();
        file.nextLine();
        Stack<String> bread = new Stack<>();
        Stack<String> meat = new Stack<>();
        Stack<String> cheese = new Stack<>();
        while(times-->0)
        {
            String[] s = file.nextLine().split("-");
            switch(s[1])
            {
                case "bread": bread.add(s[0]); break;
                case "meat": meat.add(s[0]); break;
                case "cheese": cheese.add(s[0]); break;
            }
        }
        while(!bread.isEmpty() && !meat.isEmpty() && !cheese.isEmpty())
        {
            System.out.println(bread.pop() + ", " + meat.pop() + ", " + cheese.pop());
        }
	}
	public static void main(String[] args) throws Exception {
		new Sandwiches_Tristan().run();
	}
}