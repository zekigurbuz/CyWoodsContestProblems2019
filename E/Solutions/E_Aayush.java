import java.util.*;
import java.io.*;

public class E_Aayush {
	public void run() throws Exception {
		Scanner file = new Scanner(new File("simulator.dat"));
		int times = file.nextInt(); file.nextLine();
		for (int asdf = 0; asdf < times; asdf++) {
			double t1 = file.nextDouble();
			double t2 = file.nextDouble();
			double t3 = file.nextDouble();
			double p = file.nextDouble();
			double ans = Math.abs(((t1+t2+t3)/3 - p)/p) * 100;
			System.out.printf("%.2f%%",ans);
			if (file.hasNext()) System.out.println();;
		}

	}

	public static void main(String[] args) throws Exception {
		new E_Aayush().run();
	}

}
