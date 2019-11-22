import java.util.*;
import java.util.concurrent.*;
import java.io.*;

public class Graduation_Alex { 
	public static long daysBetween(Calendar startDate, Calendar endDate) {
	    long end = endDate.getTimeInMillis();
	    long start = startDate.getTimeInMillis();
	    return TimeUnit.MILLISECONDS.toDays(Math.abs(end - start));
	}
	public void run() throws Exception {
		Scanner file = new Scanner(new File("graduation.dat"));
		int times = file.nextInt();
		file.nextLine();
		for (int i = 0; i < times; i++) {
			String[] f = file.nextLine().split(" ");
			Calendar date = new GregorianCalendar(Integer.parseInt(f[2]), Integer.parseInt(f[0]), Integer.parseInt(f[1]));
			int x = Integer.parseInt(file.nextLine());
			for (int j = 0; j < x; j++) {
				String[] data = file.nextLine().split(" ");
				if (data.length < 4) {
					for (String d: data) {
						if (!(d.matches("\\d+"))) System.out.println("Don't have enough data on " + d);
					}
				}
				else if (data.length > 4) {
					for (String d: data) {
						if (!(d.matches("\\d+"))) System.out.println("Bad data for " + d);
					}
				}
				else {
					List<String> list = new ArrayList<>();
					for (String d: data) {
						list.add(d);
					}
					String name = "";
					for (int q = 0; q < list.size(); q++) {
						if (!(list.get(q).matches("\\d+"))) {
							name = list.get(q);
							list.remove(q);
							q--;
							break;
						}
					}
					int year = 0;
					for (int q = 0; q < list.size(); q++) {
						if (Integer.parseInt(list.get(q)) >= 1000 && Integer.parseInt(list.get(q)) <= 9999) {
							year = Integer.parseInt(list.get(q));
							list.remove(q);
							q--;
							break;
						}
					}
					if (year == 0) {
						System.out.println("Bad data for " + name);
						continue;
					}
					else {
						int day = 0;
						for (int q = 0; q < list.size(); q++) {
							if (Integer.parseInt(list.get(q)) > 12 && Integer.parseInt(list.get(q)) <= 31) {
								day = Integer.parseInt(list.get(q));
								list.remove(q);
								q--;
								break;
							}
						}
						int month = 0;
						if (day == 0) {
							if (Integer.parseInt(list.get(0)) == Integer.parseInt(list.get(1)) && Integer.parseInt(list.get(0)) > 0 && Integer.parseInt(list.get(0)) <= 12) {
								month = Integer.parseInt(list.get(0));
								day = Integer.parseInt(list.get(0));
								list.remove(0);
								list.remove(0);
							}
							else {
								System.out.println("Bad data for " + name);
								continue;
							}
						}
						if (month == 0) {
							if (Integer.parseInt(list.get(0)) > 0 && Integer.parseInt(list.get(0)) <= 12) {
								month = Integer.parseInt(list.get(0));
								list.remove(0);
							}
							else {
								System.out.println("Bad data for " + name);
								continue;
							}
						}
						Calendar a = new GregorianCalendar(year, month, day);
						long days = daysBetween(date, a);
						if (days/((365*4)) > 0) {
							System.out.println(name + " already graduated!");
						}
						else System.out.println(name + " graduates in " + ((365*4) - days) + " days");
					}
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) throws Exception {
		new Graduation_Alex().run();
	}
}