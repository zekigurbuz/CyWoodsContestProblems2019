import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

			//change the class name
public class QuizBot_Christian
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("quizbot.dat"));
		
			//read in the number at the top of the data file
		int times = file.nextInt(); 
			//pick up the left over enter key
		file.nextLine();
		
			//read in each data set
		for(int asdf = 0; asdf<times; asdf++)
		{
			String[] names = file.nextLine().split(" ");
			String[] correct = file.nextLine().split(" ");
			String[] answers = file.nextLine().split(" ");
			int counta = 0, countb = 0;
			for(int x = 0; x < answers.length;x+=2)
			{
			if(answers[x].equals(correct[x/2])) counta++;
			if(answers[x+1].equals(correct[x/2])) countb++;
			}
			if(counta > countb)
			System.out.println( names[0] +" has won this round!");
			else if(countb > counta)
			 System.out.println( names[1] + " has won this round!");
			else
			System.out.printf("%s and %s are tied this round!",names[0],names[1]);
			}


	}

	public static void main(String[] args) throws Exception
	{
			//change this to whatever your class name is
		new QuizBot_Christian().run();
	}	
	
}