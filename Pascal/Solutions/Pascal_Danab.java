import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class Pascal_Danab
{
	
	 
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("pascal.dat"));
		
		while(file.hasNext()) {
			printPascal(file.nextInt());
		}
	}
	
	void printPascal(int n) 
	{ 
	    for (int line = 0; line < n; line++) 
	    { 
	        for (int i = 0; i <= line; i++) 
	            System.out.printf("%d ", binomialCoeff(line, i)); 
	       System.out.println("\n"); 
	    } 
	} 

	int binomialCoeff(int n, int k) 
	{ 
	    int res = 1; 
	    if (k > n - k) 
	    k = n - k; 
	    for (int i = 0; i < k; ++i) 
	    { 
	        res *= (n - i); 
	        res /= (i + 1); 
	    } 
	
	    return res; 
	} 
	
	public static void main(String[] args) throws Exception
	{
		new Pascal_Danab().run();
	}	
	
}