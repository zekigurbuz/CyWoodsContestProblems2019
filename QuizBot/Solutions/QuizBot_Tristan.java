
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class QuizBot_Tristan
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("quizbot.dat"));
		int times = file.nextInt(); 
        file.nextLine();
        while(times-->0)
        {
            String n1 = file.next();
            String n2 = file.next(); file.nextLine();
            String[] ans = file.nextLine().split("\\s+");
            String[] a = file.nextLine().split("\\s+");
            int a1 = 0;
            int b1 = 0;
            for(int i=0;i<a.length;i+=2)
            {
                if(a[i].equals(ans[i/2])) a1++;
                if(a[i+1].equals(ans[i/2])) b1++;
            }
            if(a1 > b1) System.out.println(n1 + " has won this round!");
            else if(a1 < b1) System.out.println(n2 + " has won this round!");
            else System.out.println(n1 + " and " + n2 + " are tied this round!");
        }
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new QuizBot_Tristan().run();
	}	
	
}