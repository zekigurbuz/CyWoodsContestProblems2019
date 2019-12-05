import java.io.*;
import java.util.*;
import java.text.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Character.*;
import static java.util.Collections.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class QuizBot_Michael
{
	public static void main(String[] args)throws Exception
	{
		Scanner file=new Scanner(new File("quizbot.dat"));
		
		int times = file.nextInt();
		file.nextLine();	//pick up trash
		
		for( int t = 0; t < times; t++ )
		{
			String player1 = file.next();
			int score1 = 0;
			String player2 = file.next();
			int score2 = 0;
			file.nextLine();
			
			String[] ans = file.nextLine().split(" ");
			
			String[] play = file.nextLine().split(" ");
			String[] one = new String[play.length/2];
			String[] two = new String[play.length/2];
			
			for (int j=0; j<play.length; j++)
			{
				if (j<play.length/2)
				{
					one[j] = play[j];
				} else {
					two[j-two.length] = play[j];
				}
			}
			
			for (int i=0; i<ans.length; i++)
			{
				if (ans[i].equals(one[i])) score1++;
				if (ans[i].equals(two[i])) score2++;
			}
			if (score1>score2) System.out.println(player1 + " has won this round!");
			if (score1<score2) System.out.println(player2 + " has won this round!");
			if (score1==score2) System.out.println(player1 + " and " + player2 + " are tied this round!");
		}
		
	}
}