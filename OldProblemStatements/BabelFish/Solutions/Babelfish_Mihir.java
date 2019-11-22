import java.io.*;
import java.util.*;

public class Babelfish_Mihir {
	public static void run() throws Exception {
		Scanner file = new Scanner(new File("babelfish.dat"));
		int times = file.nextInt(); file.nextLine();
		for (int i = 0; i < times; i++) {
			int sShift = file.nextInt();
			int dShift = file.nextInt();
			file.nextLine();
			String encodedMessage =file.nextLine();
			ArrayList<Character> vals = new ArrayList<Character>();
			char beg = 32;
			for(int x=beg;x<123;x++) {
				vals.add(beg);
				beg++;
			}
			Collections.rotate(vals, sShift);
			Collections.reverse(vals);
			ArrayList<Character> vals2 = new ArrayList<Character>();
			for(char gg:vals) {
				vals2.add(gg);
			}
			ArrayList<Character> dShiftArr = new ArrayList<Character>();
			int temp = vals.size();
			int temp2 = dShift;
			for(int g=0;g<temp;g++) {
				Character var = vals.get(dShift%vals.size());
				dShiftArr.add(var);
				vals.remove(var);
				dShift+=temp2;
			}
			Map<Character, Character>  charMap = new TreeMap<Character,Character>();
			for(int x=0;x<vals2.size();x++) {
				charMap.put(dShiftArr.get(x),vals2.get(x));
			}
			
			/*
			for(char c:encodedMessage.toCharArray()) {
				for(char g:charMap.keySet()) {
					if(charMap.get(g)==c) {
						//System.out.print(charMap.get(g));
					}
				}	
			}
			System.out.println();
			*/
			for(char c:encodedMessage.toCharArray()) {
				System.out.print(charMap.get(c));
			}
			System.out.println();
			
		}
	}
	public static void main(String[] args) throws Exception {
		new Babelfish_Mihir().run();
	}
}