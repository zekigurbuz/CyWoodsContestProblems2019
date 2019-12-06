import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class Bens_Christian
{
	public void run() throws Exception
	{
		Scanner file = new Scanner(new File("bens.dat"));
		int times = file.nextInt(); 
		file.nextLine();
		for(int asdf = 0; asdf<times; asdf++)
		{
			int size = file.nextInt(); file.nextLine();
			String[] names = new String[6];
			Map<String,Comparator> map = new HashMap<String,Comparator>();
		for(int x =0; x < size;x++) {
				names=file.nextLine().split(" ");
				Double[] values = {Double.parseDouble(names[2]),Math.abs(Double.parseDouble(names[4])-Double.parseDouble(names[3])),Double.parseDouble(names[5])};
				map.put(names[1],new Comparator(values));}
		
		List<Entry<String, Comparator>> list = new LinkedList<Map.Entry<String, Comparator> >(map.entrySet()); 
		list.sort(Entry.comparingByValue());
		for(int x=0; x < list.size()-1;x++)
			System.out.printf("Ben %s, ",list.get(x).getKey());
		System.out.printf("Ben %s\n", list.get(list.size()-1).getKey());
	}
		}
	public static void main(String[] args) throws Exception {new Bens_Christian().run();}	
}
class Comparator implements Comparable<Comparator>{
	double range, grade, length;
	public Comparator(Double[] values)
	{
		grade = values[0];
		range = values[1];
		length = values[2];
}
	public int compareTo(Comparator a) {
		if(grade > a.grade) return 1;
		else if(grade < a.grade) return -1;
		if(range > a.range) return 1;
		else if (range < a.range) return -1;
		if (length > a.length) return 1;
		else if (length < a.length) return -1;
		return 0;
	}

}