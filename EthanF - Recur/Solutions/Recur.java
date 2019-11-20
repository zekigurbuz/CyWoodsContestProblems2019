
import java.io.File;
import java.util.Scanner;
public class Recur
{
	public void run()throws Exception
	{
		Scanner file=new Scanner(new File("Judge.dat"));
		int sum = 0;
		while(file.hasNext() == true)
		{
			int y = file.nextInt();
			System.out.println(recur(y, sum));
		}
	}	
		
	public int recur(int x, int sum)
	{
		if(x != 0)
		{
			sum=x+recur(x-1,sum);
		}
		return sum;
	}
	public static void main(String[] args)throws Exception {
		Recur a = new Recur();
		a.run();
		
}
}
