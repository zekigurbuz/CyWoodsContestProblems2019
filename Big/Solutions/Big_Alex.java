import java.util.*;
import java.io.*;
import java.math.*;

public class Big_Alex { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("big.dat"));
		while(file.hasNext()) {
			int a = file.nextInt();
			BigInteger b = new BigInteger(file.next());
			double c = Math.log10(a);
			BigDecimal d = new BigDecimal(c);
			d = d.multiply(new BigDecimal(b));
			BigDecimal e = d.remainder(BigDecimal.ONE);
			BigDecimal f = d.subtract(e);
			
			System.out.println(String.format("%.2f", Math.pow(10, e.doubleValue())) + "E" + String.format("%.0f",f.doubleValue()));
			
		}
	}
	public static void main(String[] args) throws Exception {
		new Big_Alex().run();
	}
}