import java.util.*;
import java.io.*;

public class Money_Brian
{
	public static void main(String[] args) throws Exception
	{
		new Money_Brian().run();
	}
	
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("money.dat"));
		int times = file.nextInt();
		for(int asdf=0;asdf<times;asdf++)
		{
			int deposit = file.nextInt();
			double reserveRequirement = file.nextDouble();
			double multiplier = 1/reserveRequirement;
			
			double depositChange = multiplier * deposit;
			double moneySupplyChange = multiplier * deposit * (1-reserveRequirement);
			if(depositChange>0)
			{
				System.out.printf("DD INCREASE: $%.2f%n",depositChange);
				System.out.printf("MONEY INCREASE: $%.2f%n", moneySupplyChange);
			}
			else
			{
				System.out.printf("DD DECREASE: $%.2f%n",depositChange*-1);
				System.out.printf("MONEY DECREASE: $%.2f%n", moneySupplyChange*-1);
			}
		}
	}
	
}
