import java.io.*;
import java.util.*;

public class Naughty_Mihir {
	public static void run() throws Exception {
		Scanner file = new Scanner(new File("naughty.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int ab = 0; ab < times; ab++) {
			int caseTwo = file.nextInt();
			file.nextLine();
			char[] rightMessage = file.nextLine().toCharArray();
			TreeMap<Double, String> percentString = new TreeMap<Double,String>(Collections.reverseOrder()); 
			for(int c2=0;c2<caseTwo-1;c2++) {
				char[] testArr = file.nextLine().toCharArray();
				int charsRight=0;
				for(int i=0;i<rightMessage.length;i++) {
					if(testArr[i]==rightMessage[i]) {
						charsRight++;
					}
				}
				String permuteMessage = String.valueOf(testArr);
				double rightPerc = ((double)(charsRight))/(rightMessage.length);
				if(!percentString.containsKey(rightPerc)) {
					percentString.put(rightPerc,permuteMessage);
				}
			}
			if(percentString.firstKey()==0.0)
				System.out.printf("%s\nAccuracy Percentage: NaN\n\n", "FAILED");
			else System.out.printf("%s\nAccuracy Percentage: %-1.0f%%\n\n", percentString.get(percentString.firstKey()), 100*(percentString.firstKey()));
		}
	}

	public static void main(String[] args) throws Exception {
		new Naughty_Mihir().run();
	}

}