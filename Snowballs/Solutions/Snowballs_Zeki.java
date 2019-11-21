/** IMPORTS **/
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import java.lang.Math.*;

public class Snowballs_Zeki {
	/** GLOBAL VARIABLES **/
	long times = -1;
	BigInteger[] fact = new BigInteger[1001];

	/** MAIN CODE **/
	public void run() throws Exception {
		Scanner file = new Scanner(new File("snowballs.dat".toLowerCase()));
		times = Long.parseLong(file.nextLine().trim());
		fact[0] = BigInteger.ONE;
		for (int i = 1; i <= 1000; i++) {
			fact[i] = fact[i - 1].multiply(new BigInteger(i + ""));
		}
		for (long asdf = 1; asdf <= times; asdf++) {
			int n = file.nextInt();
			BigInteger[] p = new BigInteger[n + 1];
			p[0] = BigInteger.ZERO;
			for (int i = 1; i <= n; i++) {
				p[i] = p[i - 1].add(ncr(i, (i + 1) / 2));
			}
			for (int i = 1; i <= n; i++) {
				p[i] = p[i].add(p[i - 1]);
			}
			System.out.println(p[n]);
		}
		file.close();
	}
	
	public BigInteger ncr(int n, int r) {
		return fact[n].divide(fact[r]).divide(fact[n - r]);
	}

	/** EXTRAS **/
	public static void main(String[] cows) throws Exception {
		new Snowballs_Zeki().run();
	}
}
