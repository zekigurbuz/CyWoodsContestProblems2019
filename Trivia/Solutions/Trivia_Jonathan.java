import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class Trivia_Jonathan
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("trivia.dat"));
		
			//read in the number at the top of the data file
		int times = file.nextInt(); 
			//pick up the left over enter key
		file.nextLine();
		
			//read in each data set
		for(int asdf = 0; asdf<times; asdf++)
		{
            String[] names = file.nextLine().split(" ");
            String a = file.nextLine();
            String[] QuestionAnswers = a.split(" ");
            String b= file.nextLine();
            String[] PlayerAnswers = b.split(" ");
            int playerscore1 = 0;
            int playerscore2 = 0;
            int x = 0;
            for(int i = 0; i < QuestionAnswers.length;i++)
            {
            	if(QuestionAnswers[i].equals(PlayerAnswers[x]))
            	{
            		playerscore1++;
            	}
            	x++;
            	if(QuestionAnswers[i].equals(PlayerAnswers[x]))
            	{
            		playerscore2++;
            	}
            	x++;
            }
            if(playerscore1 == playerscore2)
            {
            	System.out.println(names[0] + " and " + names[1] + " are tied this round!");
            }
            else
            if(playerscore1 > playerscore2)
            {
            	System.out.println(names[0] + " has won this round!");
            }
            else
            if(playerscore1 < playerscore2)
            {
            	System.out.println(names[1] + " has won this round!");
            }
            
		}
	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new Trivia_Jonathan().run();
	}	
	
}
