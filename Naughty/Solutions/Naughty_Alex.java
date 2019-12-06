import java.util.*;
import java.io.*;

public class Naughty_Alex { 
	public void run() throws Exception {
		Scanner file = new Scanner(new File("naughty.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int i = 0; i < times; i++) {
			int x = file.nextInt();
			file.nextLine();
			String cmp = file.nextLine();
			TreeMap<String, Double> a = new TreeMap<>();
			for (int j = 0; j < x-1; j++) {
				a.put(file.nextLine(), 0.0);
			}
			
			for (Map.Entry<String, Double> m: a.entrySet()) {
				String k = m.getKey();
				int r = 0;
				for (int q = 0; q < k.length(); q++) {
					if (k.charAt(q) == cmp.charAt(q)) r++;
				}
				m.setValue((((double)r)/k.length()) * 100);
			}
			List<Map.Entry<String, Double>> list = new ArrayList<>();
			for (Map.Entry<String, Double> m: a.entrySet()) list.add(m);
			Collections.sort(list, new Comparator<Map.Entry<String, Double> >() { 
	            public int compare(Map.Entry<String, Double> o1,  
	                               Map.Entry<String, Double> o2) 
	            { 
	                return (o2.getValue()).compareTo(o1.getValue()); 
	            } 
	        }); 
			if (list.get(0).getValue() == 0.0) System.out.println("FAILED\nAccuracy Percentage: NaN");
			else System.out.println(list.get(0).getKey() + "\nAccuracy Percentage: " + Math.round(list.get(0).getValue()) + "%");
			System.out.println();
		}
		
	}
	public static void main(String[] args) throws Exception {
		new Naughty_Alex().run();
	}
}